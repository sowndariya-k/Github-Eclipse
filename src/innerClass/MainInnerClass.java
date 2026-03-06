// illustrate Regular inner class;
package innerClass;

class OuterClass{
	int age=18;
	public void checkAge() {
		System.out.println("In CheckAge() Method call");
	}
	class InnerClass{
		public void show() {
			System.out.println("In show() Method call of inner class");
		}
	}
}

public class MainInnerClass {

	public static void main(String[] args) {
		OuterClass outer=new OuterClass();
		System.out.println("OuterClass Age: "+outer.age);
		System.out.println("OuterClass.checkAge(): ");
		outer.checkAge();
		
		
		OuterClass.InnerClass inner=outer.new InnerClass();
		System.out.println("Inner Class Method call: ");
		inner.show();
		//inner.checkAge(); not possible - The method checkAge() is undefined for the type OuterClass.InnerClass

	}

}
