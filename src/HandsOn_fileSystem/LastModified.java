package HandsOn_fileSystem;

import java.io.File;
import java.util.Date;

public class LastModified {

	    public static void main(String[] args) {

	        File f = new File("C:\\Users\\Sowndariya\\Desktop\\Expleo\\Java Core (Expleo)\\Control_Flow_Statements\\src\\HandsOn_fileSystem\\text.txt");

	        long time = f.lastModified();

	        Date d = new Date(time);

	        System.out.println("Last Modified Time: " + d);

	    }
}


