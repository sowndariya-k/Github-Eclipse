package HandsOn_ControlFlow;
import java.util.*;
public class CheckCharacters {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the Character: ");
		char ch=input.next().charAt(0);
		
		if(ch>='a'&& ch<='z' || ch>='A' && ch<='Z') {
			System.out.println("It is an Alphabet.");
		}
		else if(ch>='0' && ch<='9') {
			System.out.println("It is a Digit.");
		}
		else {
			System.out.println("It is a Special Symbol.");
		}
		
		input.close();
	}

}
