/** Exercise 6
 *
 * A point record that holds an x and y coordinate.
 *
 */

/** A {@code Point} object that represents a coordinate in the 2D plane.
 */
public record Point(double x, double y) {
	/** Translates the x and y coordinate of a Point.
	 *
	 * @param x the amount to translate by in the x coordinate.
	 * @param y the amount to translate by in the y coordinate.
	 * @return Point object with the translated coordiantes of the origin Point.
	 *
	 */
	public Point translate(double x, double y) {
		return new Point(this.x + x, this.y + y);
	}

	/**
	 * Scales the x and y coordinate of Point.
	 *
	 * @param factor the factor with which to scale.
	 * @return Point object with the scaled coordinates of the origin Point.
	 *
	 */
	public Point scale(double factor) {
		return new Point(this.x * factor, this.y * factor);
	}

	public static void main(String[] args) {
		Point p = new Point(3, 4).translate(1, 3).scale(0.5);
		System.out.printf("The point p is (%.2f, %.2f)\n", p.x(), p.y());
	}
}
