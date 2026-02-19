package HandsOn_ControlFlow;
import java.util.*;
public class JobWorkBill {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter Number of Pages: ");//5
		int pages=input.nextInt();
		
		System.out.print("Enter Number of Copies: ");//3
		int copies=input.nextInt();
		
		int totalBill=0;
		int typingCost=pages*3;//15
		int printingCost;
		
		if(copies>=1) {
			printingCost= pages*1;//5
			
			if(copies>1) {
				printingCost+=(copies-1)*pages*3;//2*5*3=30+5=35
			}
		}
		else {
			printingCost=0;
		}
		
		totalBill=typingCost + printingCost;//15+35=50
		System.out.println("Total Bill: Rs. "+totalBill);
		
		
		input.close();
	}

}
