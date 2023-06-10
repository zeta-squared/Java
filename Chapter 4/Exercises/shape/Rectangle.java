package shape;

import point.Point;

public class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle(Point topLeft, double width, double height) {
		super(topLeft);
		this.width = width;
		this.height = height;
	}

	public Point getCentre() {
		return new Point(this.point.getX() + (width / 2), this.point.getY() + (height / 2));
	}
}
