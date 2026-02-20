package OOPS;
/**
 * Compile time polymorphism
 */

class Adder{
	static int add(int a, int b) {
		return a+b;
	}
	static double add(double a, double b) {
		return a+b;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println(Adder.add(1, 2));
		System.out.println(Adder.add(1.5, 2.5));

	}

}
