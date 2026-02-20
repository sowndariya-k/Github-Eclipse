package HandsOn_Functions;

import java.util.*;

public class SalaryHike {
	
	public static void calculateHike(double oldSalary, int hike) {
		double newSalary=0;
		//no hike
		if(hike==0) {
			System.out.println("New Salary: "+oldSalary);
		}
		//apply hike
		else {
			newSalary=oldSalary + (oldSalary*hike/100);
			System.out.println("New Salary: "+newSalary);
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter Employee OldSalary: ");
		double oldSalary= input.nextDouble();
		
		System.out.print("Hike: ");
		int hike= input.nextInt();
		
		calculateHike(oldSalary, hike);
		input.close();
	}

}
