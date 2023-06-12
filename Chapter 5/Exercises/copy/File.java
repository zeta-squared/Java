package copy;

import java.util.Objects;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.file.Path;

public class File {
	public static void main(String[] args) {
		Scanner in = null;
		PrintWriter out = null;
		try {
			in = new Scanner(Path.of(args[0]).toAbsolutePath());
			out = new PrintWriter(args[1]);
			while (in.hasNext()) {
				out.println(in.next().toLowerCase());
			}
		} catch (IOException ex) {
			try {
				out.close();
			} catch (Exception exc) {
				ex.addSuppressed(exc);
			}

			try {
				in.close();
			} catch (Exception exc) {
				ex.addSuppressed(exc);
			}

			if (ex instanceof FileNotFoundException exc)
				System.err.println("Caught FileNotFoundException: " + ex.getMessage());

			System.err.println("Caught IOException: " + ex.getMessage());
			for (Throwable exc : ex.getSuppressed()) {
				System.err.println(exc.toString());
			}
		} catch (Exception ex) {
			try {
				out.close();
			} catch (Exception exc) {
				ex.addSuppressed(exc);
			}

			try {
				in.close();
			} catch (Exception exc) {
				ex.addSuppressed(exc);
			}
			
			System.err.println("Caught Exception: " + ex.getMessage());
			for (Throwable exc : ex.getSuppressed()) {
				System.err.println(exc.toString());
			}
		}
		try {
			out.close();
		} catch (Exception ex) {
			System.err.println(ex.toString());
		}

		try {
			in.close();
		} catch (Exception ex) {
			System.err.println(ex.toString());
		}
	}
}
