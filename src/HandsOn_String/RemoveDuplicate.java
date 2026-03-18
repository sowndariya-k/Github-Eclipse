package HandsOn_String;

import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (c == str.charAt(j)) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				result.append(c);
			}
		}
		System.out.println("INPUT: " + str);
		System.out.println("OUTPUT: " + result);
		input.close();
	}

}
