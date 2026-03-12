package HandsOn_Oops6;

interface Movable {
	void moveup();

	void moveDown();

	void moveLeft();

	void moveRight();
}

class MovablePoint implements Movable {
	int x, y, xSpeed, ySpeed;

	MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public void moveup() {
		y = y + ySpeed;

	}

	@Override
	public void moveDown() {
		y = y - ySpeed;

	}

	@Override
	public void moveLeft() {
		x = x - xSpeed;

	}

	@Override
	public void moveRight() {
		x = x + xSpeed;

	}

	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}

}

class MovableCircle implements Movable {
	int radius;
	MovablePoint center;

	MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}

	public void moveup() {
		center.moveup();
	}

	public void moveDown() {
		center.moveDown();
	}

	public void moveLeft() {
		center.moveLeft();
	}

	public void moveRight() {
		center.moveRight();
	}

	public String toString() {
		return center.toString() + ", radius=" + radius;
	}

}

public class Main {
	public static void main(String[] args) {
		MovablePoint p = new MovablePoint(2, 3, 1, 1);
		System.out.println(p);

		p.moveup();
		p.moveRight();

		System.out.println("After Move:" + p);

		MovableCircle c = new MovableCircle(5, 5, 2, 2, 10);
		System.out.println(c);

		c.moveLeft();
		c.moveDown();

		System.out.println("After Move:" + c);
	}
}
