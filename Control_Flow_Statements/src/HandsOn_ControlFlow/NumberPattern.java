package HandsOn_ControlFlow;
import java.util.*;
public class NumberPattern {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		int num=input.nextInt();
		
		for(int i=1; i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		input.close();
	}

}
