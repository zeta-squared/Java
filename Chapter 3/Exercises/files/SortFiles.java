package files;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class SortFiles {
	public static void main(String[] args) {
		if (args.length == 1) {
			File dir = new File(args[0]);
			File[] files = dir.listFiles();
			System.out.println("The unsorted file list is:");
			for (File file : files)
				System.out.println(file.toString());

			Arrays.sort(files, Comparator.comparing(File::isFile).thenComparing(File::compareTo));
			System.out.println("The sorted file list is:");
			for (File file : files)
				System.out.println(file.toString());
		} else {
			System.out.println("Incorrect use of the program.");
		}

		return;
	}
}
