package HandsOn_ControlFlow;

import java.util.*;

public class CharactersCount {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String name= input.nextLine();
		
		int letter=0;
		int digits=0;
		int symbols=0;
		
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
		
		if(ch>='a'&& ch<='z' || ch>='A' && ch<='Z') {
			letter++;
		}
		else if(ch>='0' && ch<='9') {
			digits++;
		}
		else {
			symbols++;
		}
		}
		System.out.println("Letters: "+letter+
				          ", Digits: "+digits+
				          ", Other Symbols: "+symbols);
		
		input.close();

	}

}
