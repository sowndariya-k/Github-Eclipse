package HandsOn_Functions;

import java.util.*;

public class CheckPrintPrime {
	
	//To check prime number
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		//math.sqrt(n) or n/2
		for(int i=2; i<=(num/2); i++) {
			if(num%i==0) {
				return false;//divisible , not a prime
			}
		}
			return true;// not divisible, prime number
	}
	
	public static void printPrime(int x, int y) {
		for(int i=x; i<=y; i++) {
			if(isPrime(i)) {
				System.out.print(i+ " ");
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		//get x, y value
		System.out.print("Enter X and Y value: ");
		int x=input.nextInt();
		int y=input.nextInt();
		
		//check x and y is valid
		if(x>y) {
			System.out.println("Provide valid input");
		}
		else {
			System.out.println("Prime numbers between "+x+ " and "+y+" is: ");
			printPrime(x, y);
		}
		
		input.close();
	}

}
