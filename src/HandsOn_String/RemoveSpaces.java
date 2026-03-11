package HandsOn_String;

import java.util.*;

public class RemoveSpaces {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = input.nextLine();
		int start = 0;
		int end = str.length() - 1;

		while (start <= end && str.charAt(start) == ' ') {
			start++;
		}
		while (end >= start && str.charAt(end) == ' ') {
			end--;
		}

		String result = "";
		for (int i = start; i <= end; i++) {
			result += str.charAt(i);
		}
		System.out.println(result);
		input.close();

	}

}
