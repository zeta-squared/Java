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
}
