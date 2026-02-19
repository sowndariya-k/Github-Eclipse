package HandsOn_ControlFlow;
import java.util.*;
public class ShowroomDiscount {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter total cost: ");
		double totalCost =input.nextDouble();
		
		double discount;
		
		//discount available
		if(totalCost < 2000) {
			discount = 0.05;//5%
		}
		else if(totalCost < 5000) {
			discount = 0.25;//25%
		}
		else if(totalCost < 10000) {
			discount = 0.35;//35%
		}
		else {
			discount = 0.50;//50%
		}
		
		double AmountPay = totalCost - (totalCost * discount);
		System.out.println("Amount to Pay: "+AmountPay);
		
		input.close();

	}

}
