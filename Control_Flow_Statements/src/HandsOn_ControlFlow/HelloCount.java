package HandsOn_ControlFlow;
import java.util.*;
public class HelloCount {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int count=0;
		int num;
		while(true) {
			System.out.print("Enter the Integer: ");
			num=input.nextInt();
			
			//if negative number breaks loop
			if(num<0) {
				break;
			}
			
			//execute number of times hello
			for(int i=1; i<=num;i++) {
				System.out.println("Hello");
				count++;
			}
		}
		
		System.out.println(count+ " times Hello prints");
		input.close();
	}

}
