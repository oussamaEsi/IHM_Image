package ihm_image_medical;

import java.io.File;

public class Filtre extends javax.swing.filechooser.FileFilter {
    
    String[] extensions;
    String description;

    public Filtre(String[] extensions, String description){
	super();
		
        this.extensions = extensions;
	this.description = description;
    }

    // comme FileFilter est abstraite, on redéfinit ses méthodes :
    public boolean accept(File fichier) {
	if (fichier.isDirectory())
            return true;

	String extension = null;
	String nomFichier = fichier.getName();

	int i = nomFichier.lastIndexOf('.'); // dernier . avant l'extension

	if (i > 0 && i < nomFichier.length()-1) {
            extension = nomFichier.substring(i+1, nomFichier.length());

            // On vérifie que l'extension est bien autorisée :
            for(int j = 0 ; j < extensions.length ; j++)
		if (extension.toLowerCase().equals(this.extensions[j].toLowerCase()))
                    return true;
                    // Si on arrive ici, c'est que l'on n'a pas trouvé l'extension demandée :
                    return false;
	}
        return false;
    }

    public String getDescription() {
        return this.description;
    }
    
}
