package abstraction;

interface Shapes {
	double DEFAULT_VALUE = 10;

	double calculateArea();

	double calculatePerimeter();

	default String getDescription() {
		return "A shape with unspecified dimensions";
	}
}

abstract class Circle1 implements Shapes {// implements the shapes interface
	private double radius;

	public Circle1(double radius) { // user given value
		this.radius = radius;
	}

	public Circle1() {// constructor that uses default value
		this.radius = DEFAULT_VALUE;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String getDescription() {
		return "A circle with radius" + radius;
	}

}

//in abstract need to create an childclass then create object and call
class CircleImpl extends Circle1 {

	public CircleImpl(double radius) {
		super(radius);
	}

	public CircleImpl() {
		super();
	}

}

//noramal implements 
class Rectangle1 implements Shapes {
	private double length, breadth;

	public Rectangle1(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public Rectangle1() {
		this.length = DEFAULT_VALUE;
		this.breadth = DEFAULT_VALUE;
	}

	@Override
	public double calculateArea() {
		return length * breadth;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * (length + breadth);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "A rectangle with length = " + length + " and breadth =" + breadth;
	}

}

public class Interface {
	public static void main(String[] args) {
		Rectangle1 r = new Rectangle1(5, 7);
		System.out.println(r.calculateArea());
		System.out.println(r.calculatePerimeter());
		System.out.println(r.getDescription());

		// Circle1 circle=new Circle1() ;
		/**
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		 * because of object created
		 */
		// create an object for child class then call the abstract class methods
		Shapes s = new CircleImpl(4);
		System.out.println(s.calculateArea());
		System.out.println(s.calculatePerimeter());
		System.out.println(s.getDescription());

	}

}
