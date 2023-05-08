/* Exercise 4
 *
 * A program that prints the smallest and largest positive
 * double values.
 *
 */
public class DoubleBounds {
	public static void main(String[] args) {
		System.out.printf("The smallest positive double is %f\n", Math.nextUp(0.0d));
		System.out.printf("The largest positive double is %f\n", Math.nextDown(Double.POSITIVE_INFINITY));
	}
}
