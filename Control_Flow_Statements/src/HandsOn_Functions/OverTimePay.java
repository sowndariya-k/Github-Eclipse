package HandsOn_Functions;

import java.util.*;

public class OverTimePay {
	
	public static int calculateOverTimePay(int hours) {
		int overTimePay=0;
		if(hours>40) {
			overTimePay=(hours-40)*15;
		}
		else {
			overTimePay=0;
		}
		return overTimePay;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		for(int i=1; i<=5;i++) {
			System.out.print("Enter employee  "+i+ " working hours: ");
			int hours=input.nextInt();
		}
		System.out.println("Employee overtime pay: "+);

	}

}
