package HandsOn_fileSystem;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFile {


	    public static void main(String[] args) throws IOException {

	        BufferedReader br = new BufferedReader(
	                new FileReader("C:\\Users\\Sowndariya\\Desktop\\Expleo\\Java Core (Expleo)\\Control_Flow_Statements\\src\\HandsOn_fileSystem\text.txt"));

	        String line;   // variable to store each line

	        while ((line = br.readLine()) != null) {
	            System.out.println(line);
	        }

	        br.close();
	    }
	}

