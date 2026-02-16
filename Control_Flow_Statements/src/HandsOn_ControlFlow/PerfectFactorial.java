package HandsOn_ControlFlow;
import java.util.*;
public class PerfectFactorial {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		int num=input.nextInt();
		
		if(num <= 0) {
			System.out.println("Invalid Input");
		}
		else {
			int fact=1;
			int i=1;
			
			//calculate factorial
			while(fact<num) {
				i++;
				fact *=i;
			}
			
			if(fact==num) {
				System.out.println(i);
			}
			else {
				System.out.println("Sorry. The given number is not a perfect factorial");
			}
		}
		
		input.close();
	}

}
