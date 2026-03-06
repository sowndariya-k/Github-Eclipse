//illustrate static nested classes
package innerClass;

class Person{
	int age=21;
	static int weight=45;
	static class Gender{
		void nonStaticDisplay() {
			System.out.println("In NonStatic Display Method");
			System.out.println("Weight Value: "+weight);//outer class static variable accessed in nonstatic method
		}
	
	
	static void staticDisplay() {
		System.out.println("In static Display Method");
		System.out.println("Weight value: "+weight);//outer class static variable accessed in static method 
	}
	}
	Gender gender=new Gender();//object created for nonStatic 
}

public class StaticNestedclass {

	public static void main(String[] args) {
		Person person=new Person();
		person.gender.nonStaticDisplay();//this is for non static method call
		Person.Gender.staticDisplay();
	}
}
