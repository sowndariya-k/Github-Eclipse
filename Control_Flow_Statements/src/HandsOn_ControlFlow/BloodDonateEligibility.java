package HandsOn_ControlFlow;
import java.util.*;
public class BloodDonateEligibility {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter Age: ");
		int age=input.nextInt();
		
		System.out.print("Enter Weight: ");
		int weight=input.nextInt();
		
		if(age>18 && age<55 && weight>45) {
				System.out.println("Blood donor is eligible to donating blood.");
		}
		else {
			System.out.println("Blood donor is not eligible to donating blood.");
		}
		
		input.close();
	}

}
