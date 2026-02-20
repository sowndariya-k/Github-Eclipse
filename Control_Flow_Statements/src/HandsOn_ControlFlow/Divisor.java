package HandsOn_ControlFlow;
import java.util.*;
public class Divisor {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number=input.nextInt();
		
		if(7%number==0) //1 and 7 are the only divisor of 7.
			System.out.println(number+" is a divisor of 7");
		else {
			System.out.println(number+" is not a divisor of 7 ");
		}
		input.close();
	}

}
