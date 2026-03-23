package HandsOn_exceptionHandling;

import java.util.Scanner;

class InvalidUsernameException extends Exception {}
class InvalidPasswordException extends Exception {}


public class UserValidation {
	 static String storedUsername = "User_123";
	    static String storedPassword = "Pass@123";

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Username: ");
	        String username = sc.nextLine();

	        System.out.print("Enter Password: ");
	        String password = sc.nextLine();

	        try {
	            // Username validation
	            if (username.length() < 6 || username.length() > 30 ||
	                !username.matches("[A-Za-z][A-Za-z0-9_]*")) {
	                throw new InvalidUsernameException();
	            }

	            // Password validation
	            if (password.length() < 8 ||
	                !password.matches(".*[a-z].*") ||
	                !password.matches(".*[A-Z].*") ||
	                !password.matches(".*[0-9].*") ||
	                !password.matches(".*[!@#$%^&*()\\-+].*")) {
	                throw new InvalidPasswordException();
	            }

	            // Check stored values
	            if (username.equals(storedUsername) && password.equals(storedPassword)) {
	                System.out.println("Welcome " + username);
	            } else {
	                System.out.println("Invalid username or password");
	            }

	        } catch (InvalidUsernameException | InvalidPasswordException e) {
	            System.out.println("Invalid username or password");
	        }
	    }
}
