package ihm_image_medical;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class IHM_Image_Medical {

    public static void main(String[] args) { 
    
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IHM_Image_Medical.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(IHM_Image_Medical.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(IHM_Image_Medical.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(IHM_Image_Medical.class.getName()).log(Level.SEVERE, null, ex);
        }   

    InterfacePrincipale interfacePrincipale = new InterfacePrincipale();
    interfacePrincipale.setLocationRelativeTo(null);// Mettre l'app au millieux de l'ecran
    interfacePrincipale.setVisible(true);   
 
/*
        String chaine = "a";
        String chaineHex = Utils.toHex(chaine);
        System.out.println(chaine + " " + chaine.length()+ " " + chaineHex + " " + chaineHex.length());

        String [] tab_chaineHex = Utils.SubDiviserString(chaineHex);
        for (int i=0;i< tab_chaineHex.length;i++){
            System.out.println(tab_chaineHex[i] + "  " + tab_chaineHex[i].length());
        }
        
        String chaineOrg = "";
        for(int i=0;i<tab_chaineHex.length;i++){
        chaineOrg = chaineOrg + tab_chaineHex[i];
        }
        chaineOrg = Utils.hexToString(chaineOrg);
        System.out.println(chaineOrg + " "+ chaineOrg.length());
*/        
    }
}
