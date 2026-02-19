package HandsOn_Functions;

import java.util.*;

public class OverTimePay {
	
	//calculate employee overtime pay
	public static int calculateOverTimePay(int hours) {
		int overTimePay=0;
		if(hours>40) {
			overTimePay=(hours-40)*15;
		}
		return overTimePay;
	}

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		for(int i=1; i<=5;i++) {
			System.out.print("Enter employee "+i+ " working hours: ");
			int hours=input.nextInt();
			
			int pay=calculateOverTimePay(hours);
			
			//pay greater than zero employee work overtime
			if(pay>0) {
				System.out.println("Employee "+i+" overtime pay is: Rs. "+pay);
				System.out.println();
			}
			else {
				System.out.println("No overtime pay for employee "+i);
				System.out.println();
			}
		}
			
			input.close();
	}

}
