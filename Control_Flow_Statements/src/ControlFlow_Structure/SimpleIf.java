package ControlFlow_Structure;
import java.util.*;
public class SimpleIf {

	public static void main(String[] args) {
		boolean seatAvailable=true;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Seat Number: ");
		String seatNumber=input.next();
		if(seatAvailable) {
			System.out.println("You have booked the seat number : "+seatNumber);
		}
		input.close();
		
	}

}
