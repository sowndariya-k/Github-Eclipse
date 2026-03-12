package HandsOn_fileSystem;

import java.io.File;

public class Extension {

	public static void main(String[] args) {
		File folder = new File("C:\\Users\\Sowndariya\\Desktop\\Expleo\\Java Core (Expleo)\\Control_Flow_Statements\\src\\fileSystem");

        File[] files = folder.listFiles();
        boolean found=false;

        for(File f : files) {

            if(f.getName().endsWith(".png")) {
                System.out.println(f.getName());
                found=true;
            }

        }
        if(!found) {
        	System.out.println("Specific extension file not present in folder ");
        }

	}

}
