package HandsOn_ControlFlow;
import java.util.*;
public class PurchaseDiscount {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter price of the Item: ");
		double price= input.nextDouble();
		
		System.out.print("Enter quantity: ");
		int quantity= input.nextInt();
		
		double purchaseAmount= price * quantity;
		double discount;
		
		if(purchaseAmount>1000) {
			discount= purchaseAmount*0.10;//10% discount
		}
		else {
			discount= purchaseAmount*0.05;//5% discount
		}
		double paidAmount=purchaseAmount- discount;
		
		System.out.println("Purchase Amount: "+purchaseAmount);
		System.out.println("Discount: "+discount);
		System.out.println("Paid Amount: "+paidAmount);
		input.close();
	}

}
