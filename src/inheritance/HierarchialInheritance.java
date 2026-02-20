package inheritance;
//base class
class person {
	String name;
	String address;

	public person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", address=" + address + "]";
	}

}
//derived class extends base class
class student extends person {
	String program;
	int year;
	double fee;

	public student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYeaar() {
		return year;
	}

	public void setYeaar(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "student [program=" + program + ", year=" + year + ", fee=" + fee + ", name=" + name + ", address="
				+ address + "]";
	}

}

//derived class extends base class
class staff extends person {
	String school;
	double pay;

	public staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "staff [school=" + school + ", pay=" + pay + ", name=" + name + ", address=" + address + "]";
	}

}

public class HierarchialInheritance {

	public static void main(String[] args) {
		staff s1=new staff("kavin", "ABC street", "XYZ school", 50000.00);
		System.out.println("Staff details: ");
		System.out.println(s1.toString());
		
		student st1=new student("sowndariya", "CDE block", "java", 3, 55000.0);
		System.out.println("Student details: ");
		System.out.println(st1.toString());

	}

}
