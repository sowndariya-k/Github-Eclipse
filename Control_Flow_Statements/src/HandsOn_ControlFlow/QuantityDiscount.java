package HandsOn_ControlFlow;
import java.util.*;
public class QuantityDiscount {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter price of the Item: ");
		double price= input.nextDouble();
		
		System.out.print("Enter quantity: ");
		int quantity= input.nextInt();
		
		double total= price*quantity;
		
		if(quantity >500) {
			total=total- (total*0.15);// 15 % discount
		}
		
		System.out.println("Total Expenses: "+total);
		input.close();
	}

}
