package point;

import java.util.Objects;

public class LabeledPoint extends Point {
	private String label;

	public LabeledPoint(String label, double x, double y) {
		super(x, y);
		this.label = label;
	}

	public String getLabel() { return this.label; }

	public String getCoords(Point point) {
		return "[x=" + point.x + ",y=" + point.y + "]";
	}
	
	@Override
	public String toString() {
		return super.toString() + "[label=" + getLabel() + "]";
	}

	@Override
	public boolean equals(Object object) {
		if (!super.equals(object))
			return false;

		LabeledPoint otherPoint = (LabeledPoint) object;
		return Objects.equals(getLabel(), otherPoint.getLabel());
	}

	@Override
	public int hashCode() {
		return super.hashCode() + Objects.hash(getLabel());
	}
}
