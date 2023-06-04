package directory;

import java.io.File;

public interface Subdirectory {
	public static File[] tree(File dir) {
		return dir.listFiles(File::isDirectory);
	}
}
