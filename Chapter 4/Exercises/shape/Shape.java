package shape;

import point.Point;

public abstract class Shape {
	protected Point point;
	
	public Shape(Point point) {
		this.point = point;
	}

	public void moveBy(double dx, double dy) {
		this.point = new Point(this.point.getX() + dx, this.point.getY() + dy);
	}

	public abstract Point getCentre();
}
