/* Exercise 6
 *
 * A program that takes an integer input from the terminal
 * and returns the factorial of the given integer.
 *
 */
import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = in.nextInt();
		BigInteger f = BigInteger.valueOf(n);

		for (int i = 1; i < n; i++)
			f = f.multiply(BigInteger.valueOf(i));

		System.out.println(n + "! = " + f);
	}
}
