package OOPS;
class A{
	void run() {
		System.out.println("A is running");
	}

	void drive() {
		System.out.println("A is driving");
	}
	
}
class B extends A{
	void run() {
		System.out.println("B is running");
	}
	
}
public class Upcasting {

	public static void main(String[] args) {
		A a=new B();
		a.run();
		a.drive();
		
		//B b= (B) new A(); //this is down casting
		
		//b.drive();

	}

}
