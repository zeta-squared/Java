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

	@Override
	public Rectangle clone() {
		return new Rectangle(this.point, this.width, this.height);
	}

	public static void main(String[] args) {
		Point point = new Point(0, 1);
		Rectangle rectangle = new Rectangle(point, 1, 2.1);
		Rectangle clonedRectangle = rectangle.clone();

		rectangle.moveBy(-0.5, -0.1);

		System.out.println("Centre of rectangle is " + rectangle.getCentre());
		System.out.println("Centre of clonedRectangle is " + clonedRectangle.getCentre());
	}
}
