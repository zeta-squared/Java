package point;

import java.util.Objects;

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() { return this.x; }

	public double getY() { return this.y; }

	@Override
	public String toString() {
		return getClass().getName() + "[x=" + getX() + ",y=" + getY() + "]";
	}

	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null)
			return false;
		if (getClass() != object.getClass())
			return false;
		
		Point otherPoint = (Point) object;
		return getX() == otherPoint.getX() && getY() == otherPoint.getY();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getX(), getY());
	}
}
