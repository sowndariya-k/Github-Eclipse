package HandsOn_String;

import java.util.*;

public class ValidateCorporateEmail {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String email = input.nextLine();

		// Single strict regex
		String regex = "^[A-Za-z](?!.*[._-]{2})[A-Za-z0-9._-]*[A-Za-z0-9]@" +
					   "([A-Za-z0-9]+(-[A-Za-z0-9]+)*\\.)+" +
					   "[A-Za-z]{2,}$";

		boolean isValid = email.matches(regex);

		System.out.println("INPUT: " + email);
		System.out.println("OUTPUT: " + (isValid ? "VALID" : "INVALID"));

		input.close();
	}
}