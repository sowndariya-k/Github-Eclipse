//illustrate method local inner class
package innerClass;

class Outer{
	int value=56;
	public void outerClassMethod() {
		System.out.println("Inside the Method of Outer class");
		class Inner{
			public void innerClassMethod() {
				System.out.println("Inside the Method of Inner Class");
				System.out.println("Value: "+value);
			}
		}
		Inner inner=new Inner();
		inner.innerClassMethod();
	}
}


public class MethodLocal_Innerclass {

	public static void main(String[] args) {
		Outer outer =new Outer();
		outer.outerClassMethod();
	}

}
