package HandsOn_ControlFlow;
import java.util.*;

public class SortASCII {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String str = input.nextLine();
		
		String digit= "";
		String upperCase = "";
		String lowerCase = "";
		
		for(int i=0; i<str.length();i++) {
			char ch=str.charAt(i);
			
			//digits (0-9)
			if(ch>='0' && ch<='9') {
				digit +=ch;
			}
			//upperCase letters (A-Z)
			else if(ch>='A' && ch<='Z') {
				upperCase +=ch;
			}
			//lowerCase letters (a-z)
			else {
				lowerCase +=ch;
			}
		}
		
		//string to character array
		char[] digitArray= digit.toCharArray();
		char[] upperCaseArray= upperCase.toCharArray();
		char[] lowerCaseArray= lowerCase.toCharArray();
		
		//sorting array
		Arrays.sort(digitArray);
		Arrays.sort(upperCaseArray);
		Arrays.sort(lowerCaseArray);
		
		//result
		
		System.out.print("Sorted String: ");
		System.out.print(new String(digitArray));//Array to string
		System.out.print(new String(upperCaseArray));
		System.out.print(new String(lowerCaseArray));
		
		input.close();
	}

}
