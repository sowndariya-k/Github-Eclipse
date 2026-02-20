package OOPS;

class ProjectLeader{
	String proLeadName = "Ram Kumar";
	int empId= 1000;
}

class Programmer extends ProjectLeader{
	String proName;
	int empId;
	
	void setData(String Name, int id) {
	    proName = Name;
		empId=id;
	}
	
	void display() {
		//access base class variable using super
		System.out.println("Project Lead ID: "+super.empId);
		System.out.println("Project Lead Name: "+super.proLeadName);
		System.out.println("Programmer Id: "+empId);
		System.out.println("Programmer Name: "+proName);
	}
}

public class InheritanceSuper {

	public static void main(String[] args) {
		Programmer programmer=new Programmer();
		programmer.setData("sowndariya", 1002);
		programmer.display();
	}

}
