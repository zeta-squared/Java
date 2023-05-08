/* Exercise 2
 *
 * A short program that takes an integer input from terminal,
 * then returns the normalisation of that integer between 0
 * and 359 by using either the % operator or the floorMod method.
 *
 */
import java.util.Scanner;

public class Angle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer angle: ");
		int angle = in.nextInt();

		System.out.println("Normalising this angle between 0 and 359 " +
				"using the % operator gives: " + angle % 360);
		System.out.println("Normalising this angle between 0 and 359 " +
				"using the floorMod method gives: " +
				Math.floorMod(angle, 360));
	}
}
