package streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


class Employee implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int empId;
	public String empName;
	public Employee(int id, String name) {
		this.empId= id;
		this.empName=name;
	}
	
	
}
public class Serialization {

	public static void main(String[] args) {
		
		//serialized
		Employee object= new Employee(1, "Ram");
		String filename="file.ser";
		try {
			FileOutputStream file= new FileOutputStream(filename);
			ObjectOutputStream out= new ObjectOutputStream(file);
			out.writeObject(object);
			file.close();
			System.out.println("Object has been serialized");
			
		}catch(IOException e ) {
			System.out.println("IOException");
		}
		
		//deserialized
		Employee object1=null;
		try {
			FileInputStream file=new FileInputStream(filename);
			ObjectInputStream in= new ObjectInputStream(file);
			object1=(Employee)in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized");
			System.out.println("Employee Id= "+object1.empId+" Employee name= "+object1.empName);
			
		}catch(IOException ex) {
			System.out.println("IOException is caught");
		}catch(ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}

	}

}
