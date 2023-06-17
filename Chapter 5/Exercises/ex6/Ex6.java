package ex6;

import java.io.IOException;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;

public class Ex6 {
	public static void main(String[] args) {
		BufferedReader in = null;
		Path path = Path.of("/home/zeaiter/Learning Java/Chapter 5/Exercises/");

		/* Solution (a) - Start */
		try {
			in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
			/* Read from in */
		} catch (IOException ex) {
			System.err.println("Caught IOException: " + ex.getMessage());
		} finally {
			try {
				in.close();
			} catch (IOException ex) {
				System.err.println("Caught IOException: " + ex.getMessage());
			}
		}
		/* Solution (a) - End */

		/* Solution (b) - Start */
		try {
			in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
			/* Read from in */
			in.close();
		} catch (IOException ex) {
			System.err.println("Caught IOException: " + ex.getMessage());
			try {
				in.close();
			} catch (IOException exc) {
				System.err.println("Caught IOException: " + exc.getMessage());
			}
		}
		/* Solution (b) - End */

		/* Solution (c) - Start */
		try (var newIn = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			/* Read from newIn */
			newIn.close();
		} catch (IOException ex) {
			System.err.println("Caught IOException: " + ex.getMessage());
		}
		/* Solution (c) - End */
	}
}
