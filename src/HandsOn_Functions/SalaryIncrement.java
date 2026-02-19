package HandsOn_Functions;

import java.util.*;

public class SalaryIncrement {
	public static double calculateSalaryIncrement(double salary, double rating) {
		double increment=0;
		
		//apply rating condition 
		if(rating>=1 && rating<=4) {
			increment=salary*0.10;
		}
		else if(rating>=4.1 && rating<=7) {
			increment=salary*0.25;
		}
		else if(rating>=7.1 && rating<=10) {
			increment=salary*0.30;
		}
		return salary+increment;
		
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//get salary and rating
		System.out.print("Enter the Salary: ");
		double salary=input.nextDouble();
		System.out.print("Enter the appraisal rating: ");
		double rating=input.nextDouble();
		
		if(salary<=0 || rating<1 || rating>10) {
			System.out.println("Invalid Inputs");
		}
		else {
			double newSalary= calculateSalaryIncrement(salary, rating);
			System.out.println("Salary After Increment: "+(int)newSalary);//change double into int based on expected output
		}
		input.close();

	}

}
