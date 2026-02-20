package HandsOn_ControlFlow;
import java.util.*;

public class GrossSalary {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter Basic Salary: ");
		double basicSalary=input.nextDouble();
		
		double hra, da;
		if(basicSalary<=10000) {
			hra=basicSalary*0.20;//20%
			da=basicSalary*0.80;//80%
		}
		else if(basicSalary<=20000) {
			hra=basicSalary*0.25;//25%
			da=basicSalary*0.90;//90%
		}
		else {
			hra=basicSalary*0.30;//30%
			da=basicSalary*0.95;//95%
		}
		
		double grossSalary=basicSalary + hra + da;
		System.out.println("Gross Salary: "+grossSalary);
		input.close();
	}

}
