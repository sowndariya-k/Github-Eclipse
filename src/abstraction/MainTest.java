package abstraction;

/**
 * This program demonstratees runtime polymoriphism using abstract class
 */
abstract class Shape{
	void draw() {//concrete method
		System.out.println("Drawing..");
	}
	
	abstract void area(); //abstract method
	abstract void perimeter(); //abstract method
}

class Rectangle extends Shape{
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}

	@Override
	void area() {
		System.out.println("Area of Rectangle: "+(length*breadth));	
	}

	@Override
	void perimeter() {
		System.out.println("Perimeter of Rectangle: "+(2*(length+breadth)));
	}
}


//
class Circle extends Shape{
	private int radius;
	private double pi=3.14;
	
	public Circle(int radius) {
		this.radius=radius;
	}

	@Override
	void area() {
		System.out.println("\nArea of circle : "+(pi*radius*radius));
	}

	@Override
	void perimeter() {
		System.out.println("Perimeter of circle: "+(2*pi*radius));
	}
}

class Square extends Shape{
	private int side;
	public Square(int side) {
		super();
		this.side = side;
	}
	@Override
	void area() {
		System.out.println("\nArea of square: "+(side*side));
	}

	@Override
	void perimeter() {
		System.out.println("Perimeter of square: "+(4*side));
		
	}
	
}

public class MainTest {

	public static void main(String[] args) {
		Shape s;//reference variable
		s=new Rectangle(5, 7);
		s.area();
		s.perimeter();
		
		s=new Circle(4);
		s.area();
		s.perimeter();
		
		
		s=new Square(4);
		s.area();
		s.perimeter();
	}

}
