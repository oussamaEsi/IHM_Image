package ihm_image_medical;

import java.math.BigInteger;
import javax.xml.bind.DatatypeConverter;

public class Utils {
    
    private static final BigInteger TWO_COMPL_32 = BigInteger.ONE.shiftLeft(32);
    private static String digits = "0123456789abcdef";

    // Le complement à 2 d'un entier
    public static BigInteger parseBigIntegerPositive32(BigInteger b) {
        if (b.compareTo(BigInteger.ZERO) < 0)
            b = b.add(TWO_COMPL_32);
        return b;
    }
    
     // Convertir int vers string
     public static String intToString( int b) {
	String chain;
        int length;
        BigInteger a  = new BigInteger(""+b, 10);
        
        if( b>=0 ){
          chain = a.toString(16);
          length = chain.length();
          if(length<8){
	     for(int i=0; i<8-length; i++)
		chain = "0"+ chain;
	  }
        }
        else {
            a = parseBigIntegerPositive32(a);
            chain = a.toString(16);
        }
	return chain;
     }
     
     // Concaténation
     public static String IntTo128(int a1,int a2,int a3,int a4){
	String chain = intToString(a1) + intToString(a2) + intToString(a3) + intToString(a4);
	return chain;
     }
     
     // Transformation
     public static String[] Tab32To128( int[][] matrix, int w, int h){
        int[] tmp_matrix = new int[w*h];
        int a1, a2, a3, a4, k=0;
        int taille_tmp_matrix = 0;
        
        if((w*h)%4 != 0) taille_tmp_matrix = (int)(w*h/4)+1;
        else taille_tmp_matrix = (int)(w*h/4);
        String[] resultat = new String[ taille_tmp_matrix ];

        for(int i=0 ; i<w ; i++ ){
            for(int j=0 ; j<h ; j++ ) {
                tmp_matrix[k] = matrix[i][j];
                k++;
            }
        }

        k=0;
        for(int i=0 ; i<w*h ; i=i+4 ){
           a1 = tmp_matrix[i];
           if( i+1<w*h ) a2 = tmp_matrix[i+1]; else a2=0;
           if( i+2<w*h ) a3 = tmp_matrix[i+2]; else a3=0;
           if( i+3<w*h ) a4 = tmp_matrix[i+3]; else a4=0;
           resultat[k] = IntTo128(a1,a2,a3,a4);
           k++;
        }
        return resultat;
     }
     
     //Conversion String to int
     public static int[] StringHexToInt(String chain){
	int[] table_res = new int[4];

        int l = chain.length();
        String chain0, chain1, chain2, chain3;

        chain0 = chain.substring(0,l-24);
        table_res[0] = new BigInteger(chain0, 16).intValue();
        
        chain1 = chain.substring(l-24,l-16);
        table_res[1] = new BigInteger(chain1, 16).intValue();     
        
        chain2 = chain.substring(l-16,l-8);
        table_res[2] = new BigInteger(chain2, 16).intValue();        
        
        chain3 = chain.substring(l-8,l);
        table_res[3] = new BigInteger(chain3, 16).intValue();
        
        return table_res;
    }
     
    // Convertir un tableau d'octets en chaine hexadécimale. 
    public static String toHex(byte[] data) {
        StringBuffer buf = new StringBuffer();
        
        if(data!=null) {  
            for(int i = 0; i<data.length; i++) {
                int v = data[i] & 0xff;
                buf.append(digits.charAt(v >> 4));
                buf.append(digits.charAt(v & 0xf));
            }
        }
        return buf.toString();
    }
    
    // Convertir une chaine hexadécimale en un tableau d'octets.
    public static byte[] toBytes(String chaine) {
        byte octet1=0,octet2;
        byte[] data=new byte[chaine.length()/2] ;
        char c;
        int a,j=0;
        
        for(int i=0;i<chaine.length();i++) {
            if(i%2==0) {
                c=chaine.charAt(i);
                if(('0'<=c)&&(c<='9')){
                    a=c-48;
                    octet1=(byte) a;
                    octet1=(byte) (octet1 << 4);
                }
                else {
                    if(('a'<=c)&&(c<='f')) {
                        a=c-87;
                        octet1=(byte) a;
                        octet1=(byte) (octet1 << 4);
                    }
                    else {
                        return null;
                    }
                }
            }
            else {
                c=chaine.charAt(i);
                if(('0'<=c)&&(c<='9')) {
                    a=c-48;
                    octet2=(byte) a;
                    octet1=(byte) (octet1 | octet2);
                    data[j]=octet1;
                    j++;
                }
                else {  
                    if(('a'<=c)&&(c<='f')) {
                        a=c-87;
                        octet2=(byte) a;
                        octet1=(byte) (octet1 | octet2);
                        data[j]=octet1;
                        j++;
                    }
                    else {
                        return null;
                    }
                }
            }
        }
        return data;
    }
    
    // Modifier une chaine de caractéres pour ajuster son affichage sur JTextArea.
    public static String alignerChaine(String chaine,int longueur) {
        int i=0;
        String sousChaine;
        String resultat ="";
        if(chaine!=null){
            while(i+longueur<=chaine.length()){
                sousChaine=chaine.substring(i, i+longueur)+"\n";
                resultat+=sousChaine;
                i+=longueur;
            }
            sousChaine=chaine.substring(i, chaine.length());
            resultat+=sousChaine;
        }
        return resultat;
    }
    
    // Ecrire une chaine de caractéres sur une seule ligne en éliminant les éspaces et les retours à la ligne.
    public static String etalerChaine(String chaine) {
        int i=0;
        String resultat ="";
  
        if(chaine !=null){ 
            while(i<chaine.length()){  
                if((chaine.charAt(i)!=' ')&&(chaine.charAt(i)!='\n')){
                    resultat+=chaine.charAt(i);
                }
                i++;
            }
        }
        return resultat;
    }
    
    //Transformation
    public static byte[] toByteArray(String s) {
        return DatatypeConverter.parseHexBinary(s);
    }
     
    //Transformation          
     public static String toHexString(byte[] array) {
         return DatatypeConverter.printHexBinary(array);
     }
     
    // Convert string to set of String
    public static String [] SubDiviserString( String ch){
        char [] chaine = new char [32];
        char [] tabMessage = ch.toCharArray();
        String [] tab_message;
        if(ch.length()%32 == 0 )
            tab_message = new String [ch.length()/32]; 
        else
            tab_message = new String [ch.length()/32+1];
        int k=0;
        int indice =0;

        for (int j=0;j<ch.length() ;j++){
            chaine[k] = tabMessage[j];
            k++;
            if(k==32){
                k=0;
                tab_message [indice] = new String (chaine);indice++;
                for(int jj=0;jj<32;jj++)
                    chaine[jj]='\0';
            }
        }

        if(ch.length()%32 != 0){
            for (int i = k;i<32;i++){
                chaine[i] = '0';
            }
            tab_message [indice] = new String (chaine);   
        }
        return tab_message;
    }
    // Trasformation String to Hex
    public static String toHex(String arg) {
        return String.format("%040x", new BigInteger(1, arg.getBytes(/*YOUR_CHARSET?*/)));
    }
    // Hex to String
    public static String hexToString(String hex) {
        return new String(new BigInteger(hex, 16).toByteArray());
    }
    
}
