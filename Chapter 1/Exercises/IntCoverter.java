/* Exercise 1
 *
 * A short program that takes an integer input from terminal,
 * then returns the integer in binary, octal, hexidecimal and
 * the reciprocal as a floating-point hexidecimal.
 *
 */
import java.util.Scanner;

public class IntCoverter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = in.nextInt();

		System.out.println("The integer in binary is " + toBinary(n));
		System.out.println("The integer in octal is " + toOctal(n));
		System.out.println("The integer in hex is " + toHex(n));
		System.out.println("The integers' reciprocal as a " +
				"floating-point hex is " + reciprocalToHex(n));
	}

	public static String toBinary(int n) {
		String binary = "";

		while (n > 1) {
			binary = (n % 2) + binary;
			n = (int) (n / 2);
		}

		return binary = "0b" + n + binary;
	}

	public static String toOctal(int n) {
		String octal = "";

		while (n > 7) {
			octal = (n % 8) + octal;
			n = (int) (n / 8);
		}

		return octal = "0" + n + octal;
	}

	public static String toHex(int n) {
		String hex = "";
		String[] remainder = {"", "1", "2", "3", "4", "5", "6", "7", "8",
			"9", "A", "B", "C", "D", "E", "F"};

		while (n > 15) {
			hex = remainder[n % 16] + hex;
			n = (int) (n / 16);
		}

		return hex = "0x" + n + hex;
	}

	public static String reciprocalToHex(int n) {
		float r = 1 / ((float) n);
		n = (int) (r * Math.pow(16, 8));

		return "0x0." + toHex(n).substring(2);
	}
}
