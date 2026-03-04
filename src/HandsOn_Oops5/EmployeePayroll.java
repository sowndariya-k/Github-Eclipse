package HandsOn_Oops5;

//base class
class Employee {
	String empId;
	String empName;
	double baseSalary;

	public Employee(String empId, String empName, double baseSalary) {
		this.empId = empId;
		this.empName = empName;
		this.baseSalary = baseSalary;
	}

	public String getEmpId(String empId) {
		return empId;
	}

	public String getEmpName(String empName) {
		return empName;
	}

	public double getBaseSalary(double baseSalary) {
		return baseSalary;
	}

	public double calculateSalary() {
		return baseSalary;
	}

	@Override
	public String toString() {
		return "[empId=" + empId + ", empName=" + empName + ", baseSalary=" + baseSalary + ", Salary="
				+ calculateSalary() + "]";
	}
}

//Derived class Permanent Employee
class PermanentEmployee extends Employee {
	double bonus;

	public PermanentEmployee(String empId, String empName, double baseSalary, double bonus) {
		super(empId, empName, baseSalary);
		this.bonus = bonus;
	}

	// calculate salary add bonus in baseSalary
	@Override
	public double calculateSalary() {
		return baseSalary + bonus;
	}
}

//Derived class Contract Employee
class ContractEmployee extends Employee {
	double taxRate;
	double serviceCharge;

	public ContractEmployee(String empId, String empName, double baseSalary, double taxRate, double serviceCharge) {
		super(empId, empName, baseSalary);
		this.taxRate = taxRate;
		this.serviceCharge = serviceCharge;
	}

	// calculate salary add taxRate and service
	@Override
	public double calculateSalary() {
		return baseSalary - (baseSalary * taxRate) - serviceCharge;
	}
}

//Derived class Intern Employee
class Intern extends Employee {
	double stipend;

	public Intern(String empId, String empName, double stipend) {
		super(empId, empName, 0);
		this.stipend = stipend;
	}

	// calculate salary in terms of stipend
	@Override
	public double calculateSalary() {
		return stipend;
	}

}

public class EmployeePayroll {

	public static void main(String[] args) {
		Employee e1 = new PermanentEmployee("emp1001", "hari", 10000, 50);
		System.out.println("Permanent employee details:");
		System.out.println(e1.toString());

		Employee e2 = new ContractEmployee("emp1002", "Sowndariya", 20000, 0.10, 1000);
		System.out.println("Contract employee details:");
		System.out.println(e2.toString());

		Employee e3 = new Intern("emp1003", "Priya", 10000);
		System.out.println("Intern employee details:");
		System.out.println(e3.toString());

	}

}
