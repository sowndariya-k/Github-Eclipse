package fileSystem;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMethod {
	

	public static void main(String[] args) {
		Path p1 = Paths.get("C:\\Users\\Sowndariya\\filePath\\test.txt");
		Path normalizedPath=p1.normalize();
		
		Path p2 = Paths.get("C:\\Users\\Sowndariya\\filePath\\test.txt");
		System.out.println("Normalized path: "+normalizedPath);
		
		Path subPath=p1.subpath(1, 3);
		System.out.println("Sub path: "+subPath);
		
		System.out.println("getFileName: "+p1.getFileName());
		System.out.println("getParent: "+p1.getParent());
		System.out.println("getNameCount: "+p1.getNameCount());
		System.out.println("getRoot: "+p1.getRoot());
		
		System.out.println("isAbsolute: "+p1.isAbsolute());
		System.out.println("toAbsolutePath: "+p1.toAbsolutePath());
		System.out.println("toURI: "+p1.toUri());
		
		if(p1.equals(p2)) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
		

	}

}
