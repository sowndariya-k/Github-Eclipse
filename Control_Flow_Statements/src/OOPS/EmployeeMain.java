package OOPS;

class Employee{
	int employeeID;
	String name;
	public void setEmployeeDetail(int employeeID, String name) {
		this.employeeID=employeeID;
		this.name=name;
	}
    public void getEmployeeDetail() {
		System.out.println("Employee ID: "+employeeID);
		System.out.println("Employee Name: "+name);
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
		Employee Emp1=new Employee();
		Employee Emp2=new Employee();
		Emp1.setEmployeeDetail(1001, "RAM");
		Emp2.setEmployeeDetail(1002, "RAJ");
		Emp1.getEmployeeDetail();
		Emp2.getEmployeeDetail();

	}

}
