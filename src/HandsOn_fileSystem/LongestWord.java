package HandsOn_fileSystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LongestWord {
	public static void main(String[] args) throws IOException {

		Path path = Paths.get(
				"C:\\Users\\Sowndariya\\Desktop\\Expleo\\Java Core (Expleo)\\Control_Flow_Statements\\src\\fileSystem\\text.txt");

		String text = new String(Files.readString(path));

		String words[] = text.split(" ");

		String longest = "";

		for (String w : words) {
			if (w.length() > longest.length()) {
				longest = w;
			}
		}

		System.out.println("Longest word: " + longest);
	}

}
