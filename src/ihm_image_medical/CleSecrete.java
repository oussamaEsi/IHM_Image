package ihm_image_medical;

import java.security.Key;
import javax.crypto.KeyGenerator;

public class CleSecrete {

    private String cleSecrete;
    public CleSecrete(int algo) throws Exception {
        switch(algo){  
            case 0: { //algorithme AES 128 bits.
                KeyGenerator keyGen = KeyGenerator.getInstance("AES");
                keyGen.init(128);
                Key key = keyGen.generateKey();
                byte[] raw=key.getEncoded();
                cleSecrete=Utils.toHex(raw);
                break;
            }
            case 1: {//algorithme AES 192 bits.
                KeyGenerator keyGen = KeyGenerator.getInstance("AES");
                keyGen.init(192);
                Key key = keyGen.generateKey();
                byte[] raw=key.getEncoded();
                cleSecrete=Utils.toHex(raw);
                break;
            }
            case 2: {//algorithme AES 256 bits.
                KeyGenerator keyGen = KeyGenerator.getInstance("AES");
                keyGen.init(256);
                Key key = keyGen.generateKey();
                byte[] raw=key.getEncoded();
                cleSecrete=Utils.toHex(raw);
                break;
            }
        }
    }
    
    public String getCleSecrete() {
        return cleSecrete;
    }     
}
