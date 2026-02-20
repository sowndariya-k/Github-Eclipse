package HandsOn_ControlFlow;
import java.util.*;
public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter employee wages: ");
		double wages=sc.nextDouble();
		
		System.out.print("Enter number of days working:");
		int days=sc.nextInt();
		
		if(wages>0 && days>0) {
			double totalSalary=wages*days;
			System.out.println("Total Salary : "+totalSalary);
		}
		else {
			System.out.println("Salary cannot calculate because wages and days always greater than 0");
		}
		
		sc.close();
	}

}
