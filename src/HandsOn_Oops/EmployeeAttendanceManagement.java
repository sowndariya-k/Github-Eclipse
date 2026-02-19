package HandsOn_Oops;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Employee{
	private int empId;
	private String empName;
	
	Employee(int empId, String empName){
		this.empId=empId;
		this.empName=empName;
	}
	
	public int getEmpId(){
		return empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
}
class Attendance{
	private int empId;
	private LocalTime checkInTime;
	private LocalTime checkOutTime;
	private boolean isCheckedIn;
	private boolean isCheckedOut;
	
	public Attendance(int empId) {
		this.empId=empId;
		this.isCheckedIn=false;
		this.isCheckedOut=false;
	}
	
	
	
    public void  markCheckIn() {
    	if(!isCheckedIn) {
    		checkInTime=LocalTime.now();
    		isCheckedIn=true;
    		System.out.println("Employee "+empId+" checked in at "+checkInTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    	}
    	else {
    		System.out.println("Employee "+empId+" Already logged in Today.");
    	}
		
	}
	
    public void  markCheckOut() {
    	if(isCheckedIn && !isCheckedOut) {
    		checkOutTime=LocalTime.now();
    		isCheckedOut=true;
    		System.out.println("Employee "+empId+" checked out at "+checkOutTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    	}
    	else if(!isCheckedIn) {
    		System.out.println("Cannot checked out. Employee "+empId+ " is not checked In");
    	}
    	else {
    		System.out.println("Employee "+empId+" has already checkOut.");
    	}
	}
    
    public String getAttendanceDetails() {
    	String in = (checkInTime!=null)? checkInTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")):"N/A";
    	String out = (checkOutTime!=null)? checkOutTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")):"N/A";
		return "Employee Id:" +empId+ " Check In: "+in+ " Check Out: "+out;
    	
    	
    }
	
}
public class EmployeeAttendanceManagement {

	public static void main(String[] args) {
		Employee emp1=new Employee(1001, "Alex");
		Attendance att1 =new Attendance(emp1.getEmpId());
		
		att1.markCheckOut();
		att1.markCheckIn();
		att1.markCheckIn();
		att1.markCheckOut();
		
	}

}
