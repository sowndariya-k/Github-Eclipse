package fileSystem;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathSubpathExample {
    public static void main(String[] args) {
        // Use \\ to escape the backslash in "filePath\test.txt"
    	
    	//method 1
        Path p1 = Paths.get("C:\\Users\\Sowndariya\\Downloads\\filePath\\test.txt");
        
        // Path elements: 0:C:, 1:Users, 2:Sowndariya, 3:Downloads, 4:filePath, 5:test.txt
        // To get "filePath\test.txt", we need indices 4 and 5 (5 is excluded)
        Path p2 = p1.subpath(4, 5);
        
        System.out.println("Original path: " + p1);
        System.out.println("Subpath (4, 5): " + p2);
        
        //method 2
        FileSystem fs=FileSystems.getDefault();
        Path p3=fs.getPath("C:\\\\Users\\\\Sowndariya\\\\Downloads\\\\filePath\\\\test.txt");
        Path p4 = p3.subpath(4, 5);

        System.out.println("Subpath (4, 5): " + p4);
        
    }
}
