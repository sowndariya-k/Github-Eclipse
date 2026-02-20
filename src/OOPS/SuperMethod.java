package OOPS;

class ProjectLeader1{
	String proLeadName = "Ram Kumar";
	int empId= 1000;
	
	void displayData() {
		System.out.println("Project Lead ID: "+empId);
		System.out.println("Project Lead Name: "+proLeadName);
	}
}

class Programmer1 extends ProjectLeader1{
	String proName;
	int empId;
	
	void setData(String Name, int id) {
	    proName = Name;
		empId=id;
	}
	
	void display() {
		//access the variable through super keyword and method 
		super.displayData();
		System.out.println("Programmer Id: "+empId);
		System.out.println("Programmer Name: "+proName);
	}
}
public class SuperMethod {

	public static void main(String[] args) {
		Programmer programmer=new Programmer();
		programmer.setData("sowndariya", 1002);
		programmer.display();

	}

}
