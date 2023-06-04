package directory;

import java.io.File;

public class GetSubdirectory implements Subdirectory {
	public static void main(String[] args) {
		if (args.length == 1) {
			File dir = new File(args[0]);
			File[] subdir = Subdirectory.tree(dir);
			for (File sub : subdir)
				System.out.println(sub.toString());
		} else {
			System.out.println("Incorrect use of program.");
		}

		return;
	}
}
