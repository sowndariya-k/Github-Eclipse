package HandsOn_Array;

import java.util.*;

public class DiceGame {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int[] arunChoice=new int[10];
		int[] naveenChoice=new int[10];
		int arunCount=0, naveenCount=0;
		
		//get choices
		for(int i=0; i<10; i++) {
			System.out.print("Arun choice: ");
			arunChoice[i]= input.nextInt();
			System.out.print("Naveen choice: ");
			naveenChoice[i]= input.nextInt();
			
			//count win times
			if(arunChoice[i]>naveenChoice[i]) {
				arunCount++;
			}
			else {
				naveenCount++;
			}
		}
		
		System.out.println();
		if(arunCount>naveenCount) {
			System.out.println("Arun Wins!!!");
		}
		else {
			System.out.println("Naveen Wins!!!");
		}
		input.close();

	}

}
