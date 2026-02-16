package HandsOn_ControlFlow;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		int num=input.nextInt();
		
		int sum=0;
		
		while(num>0) {
			int digit=num%10;//last digit
			sum+=digit;//add to sum
			num/=10;
		}
		
		System.out.println("Sum of Digits: "+sum);
		input.close();
	}

}
