/* Exercise 8
 *
 * A program that reads a string and prints all of its nonempty substrings.
 *
 */
import java.util.Scanner;

public class Substrings {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No strings given");
		} else {
			int l = args[0].length();
			for (int i = 1; i < l; i++) {
				System.out.println("The substrings of length " + i + " are:");
				for (int j = 0; (j + i) <= l; j++) {
					System.out.println(args[0].substring(j,j+i));
				}
			}
		}
	}
}
