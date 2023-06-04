package files;

import java.io.File;

public class GetFiles implements Files {
	public static void main(String[] args) {
		if (args.length == 2) {
			String[] files = Files.locateFiles(new File(args[0]), args[1]);
			for (String file : files)
				System.out.println(file);
		} else {
			System.out.println("Incorrect use of program.");
		}

		return;
	}
}
