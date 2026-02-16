package HandsOn_ControlFlow;
import java.util.*;
public class InternetBill {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter Number of Hours: ");
		int hours=input.nextInt();
		
		System.out.print("Enter Number of Minutes: ");
		int minutes=input.nextInt();
		
		if(hours>7 || (hours==7 && minutes>0)) {
			System.out.println("Exceeds maximum limit of 7 hours.");
		}
		else if(hours==5 && minutes==0) {
			System.out.println("Total Bill: Rs. 200");
		}
		else {
			int totalBill=(hours*50) + (minutes*1);
			System.out.println("Total Bill: Rs. "+totalBill);
		}
		
		input.close();
	}

}
