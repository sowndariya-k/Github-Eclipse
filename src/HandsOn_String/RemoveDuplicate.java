package HandsOn_String;

import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = input.nextLine();
		
		
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
				System.out.print(str.charAt(i));
			}
			input.close();
		}

	}

}
