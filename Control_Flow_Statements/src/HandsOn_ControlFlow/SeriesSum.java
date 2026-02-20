package HandsOn_ControlFlow;
import java.util.*;
public class SeriesSum {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the value of i: ");
		int i=input.nextInt();
		int sum=0;
		int n=1;
		
		do {
			sum+=n;//calculate sum
			n++;
		}while(n<=i);
		
		System.out.println("Sum of series from 1 to "+i+" is: "+sum);
		input.close();

	}

}
