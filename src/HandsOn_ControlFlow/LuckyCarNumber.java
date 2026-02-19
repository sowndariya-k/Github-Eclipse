package HandsOn_ControlFlow;
import java.util.*;
public class LuckyCarNumber {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the car Number: ");
		int carNum= input.nextInt();
		
		//check valid car number - 4 digit number only valid
		if(carNum <1000 || carNum > 9999) {
			System.out.println(carNum+" is not a valid car number");
		}
		else {
			int sum=0;
			
			while(carNum>0) {
				int digit=carNum%10;//remainder
				sum+=digit;//remainder add in sum
				carNum/=10;
			}
			
			//check lucky number
			if(sum%3==0 || sum%5==0 || sum%7==0) {
				System.out.println("Lucky Number");
			}
			else {
				System.out.println("Sorry it’s not my lucky number");
			}
		}
		
		input.close();
	}

}
