package shape;

import point.Point;

public class Circle extends Shape {
	private double radius;

	public Circle(Point centre, double radius) {
		super(centre);
		this.radius = radius;
	}

	public Point getCentre() {
		return this.point;
	}
}
