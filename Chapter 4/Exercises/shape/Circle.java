package shape;

import point.Point;

public class Circle extends Shape implements Cloneable {
	private double radius;

	public Circle(Point centre, double radius) {
		super(centre);
		this.radius = radius;
	}

	public Point getCentre() {
		return this.point;
	}

	@Override
	public Circle clone() {
		return new Circle(this.point, this.radius);
	}

	public static void main(String[] args) {
		Point point = new Point(0, 1);
		Circle circle = new Circle(point, 2);
		Circle clonedCircle = circle.clone();

		circle.moveBy(0, -1);

		System.out.println("Centre of circle is " + circle.getCentre());
		System.out.println("Centre of clonedCircle is " + clonedCircle.getCentre());
	}
}
