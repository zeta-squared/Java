package files;

import java.io.File;

public interface Files {
	public static String[] locateFiles(File dir, String ext) {
		if (ext.equals(".*")) {
			return dir.list((x, y) -> {
				File file = new File(x, y);
				return file.isFile();
			});
		} else {
			return dir.list((x, y) -> y.endsWith(ext));
		}
	}
}
