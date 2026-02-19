package HandsOn_Functions;

import java.util.*;

public class VoteEligiblity {
	public static boolean isEligible(int num) {
		//check age greater than or equal to 18
		if(num>=18) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter voter age: ");
		int age=input.nextInt();
		
		//check eligible 
		if(isEligible(age)) {
			System.out.println("Eligible to cast vote..");
		}
		else {
			System.out.println("Not Eligible to cast vote..");
		}
		
		input.close();
	}

}
