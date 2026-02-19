package HandsOn_Functions;

import java.util.*;

public class HighestPlacement {
	
	//max value result highest placement department
	public static void findHighest(int CS, int EC, int ME) {
		
		//find maximum value 
		 int max = Math.max(CS, Math.max(EC, ME));

	        System.out.print("Highest placement ");

	        if (CS==max) {
	            System.out.print("CS ");
	        }
	        if (EC==max) {
	            System.out.print("EC ");
	        }
	        if (ME==max) {
	            System.out.print("ME ");
	        }
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//get inputs 
		System.out.print("Enter the no of students placed in CS: ");
		int CS=input.nextInt();
		System.out.print("Enter the no of students placed in EC: ");
		int EC=input.nextInt();
		System.out.print("Enter the no of students placed in ME: ");
		int ME=input.nextInt();
		
		if(CS<0 || EC<0 || ME<0) {
			System.out.println("Input is invalid");
		}
		else {
			findHighest(CS, EC, ME);
		}
		input.close();
	}

}
