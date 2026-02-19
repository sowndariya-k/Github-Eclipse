package HandsOn_ControlFlow;
import java.util.*;

public class VowelConsonant_Symbol {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a Character: ");
		char ch=input.next().charAt(0);
		
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("It is vowel");
			break;
			
		default:
			if(Character.isLetter(ch)) {
				System.out.println("It is a Consonant.");
			}
			else {
				System.out.println("It is a Symbol.");
			}
		}
		input.close();
	}

}
