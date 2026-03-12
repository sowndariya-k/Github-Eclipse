package fileSystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SoftLink {

	public static void main(String[] args) throws IOException {
		Path existingPath = Paths.get("C:\\Users\\Sowndariya\\Downloads\\filePath\\test.txt");
		
		/*Path symLinkPath=Paths.get("C:\\test1.txt");
		try {
			Files.createSymbolicLink( symLinkPath, existingPath);
		}catch(IOException x) {
			System.out.println(x);
		}catch(UnsupportedOperationException x) {
			System.out.println(x);
		}*/
		
		Path path=Files.createFile(existingPath);
		System.out.println(path);

	}

}
