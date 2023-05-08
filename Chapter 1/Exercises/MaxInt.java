/* Exercise 3
 *
 * A program that takes three integers as input from the terminal
 * and returns a string with the maximum of the three entered integers.
 *
 */
import java.util.Scanner;

public class MaxInt {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter three integers: ");
		int i1 = in.nextInt();
		int i2 = in.nextInt();
		int i3 = in.nextInt();
		int max;

		/* max = (i1 > i2) ? ((i1 > i3) ? i1 : i3) : ((i2 > i3) ? i2 : i3); */
		max = Math.max(i1, Math.max(i2, i3));

		System.out.printf("The maximum of the three integers is %d\n", max);
	}
}
