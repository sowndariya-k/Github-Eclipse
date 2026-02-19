package HandsOn_ControlFlow;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num= input.nextInt();
		
		int original=num;
		int sum=0;
		while(num>0) {
			int digit=num%10;//Remainder
			sum+=digit*digit*digit;//cube of the digit
			num/=10;
		}
		
		if(original==sum) {
			System.out.println(original + " is an Armstrong number.");
		}
		else {
			System.out.println(original + " is not an Armstrong number.");
		}
		
		input.close();
	}

}
