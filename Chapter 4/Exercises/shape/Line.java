package shape;

import point.Point;

public class Line extends Shape {
	private Point to;

	public Line(Point from, Point to) {
		super(from);
		this.to = to;
	}

	public Point getCentre() {
		double xMid = (to.getX() + this.point.getX()) / 2;
		double yMid = (to.getY() + this.point.getY()) / 2;
		return new Point(xMid, yMid);
	}

	@Override
	public Line clone() {
		return new Line(this.point, this.to);
	}

	public static void main(String[] args) {
		Point point = new Point(0, 1);
		Line line = new Line(point, new Point(2, 3));
		Line clonedLine = line.clone();

		line.moveBy(-1, -1);

		System.out.println("The centre of line is " + line.getCentre());
		System.out.println("The centre of clonedLine is " + clonedLine.getCentre());

	}
}
