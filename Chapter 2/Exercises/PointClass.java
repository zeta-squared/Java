public class PointClass {
	private double x;
	private double y;

	PointClass(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void translate(double x, double y) {
		this.x += x;
		this.y += y;
	}

	public void scale(double factor) {
		this.x *= factor;
		this.y *= factor;
	}

	public static void main(String[] args) {
		PointClass p = new PointClass(3, 4);
		p.translate(1, 3);
		p.scale(0.5);
		System.out.printf("The point p is (%.2f, %.2f)\n", p.getX(), p.getY());
	}
}
