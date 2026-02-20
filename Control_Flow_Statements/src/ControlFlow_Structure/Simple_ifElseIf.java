package ControlFlow_Structure;

import java.util.Scanner;

public class Simple_ifElseIf {

	public static void main(String[] args) {
		String seattype;
		System.out.println("Type of seats Available\nREGULAR\nPREMIUM\nVIP\nchoose any one of the option: ");
		Scanner input=new Scanner(System.in);
		seattype=input.next();
		if(seattype.equals("REGULAR")) {
			System.out.println("You have selected Regular seat and cost is Rs.80");
		}
		else if(seattype.equals("PREMIUM")) {
			System.out.println("You have selected Premium seat and cost is Rs.100");
		}
		else if(seattype.equals("EXECUTIVE")) {
			System.out.println("You have selected Executive seat and cost is Rs.120");
		}
		else if(seattype.equals("VIP")) {
			System.out.println("You have selected VIP seat and cost is Rs.150");
		}
		else {
			System.out.println("You have not selected any type");
		}
		input.close();
	}

}
