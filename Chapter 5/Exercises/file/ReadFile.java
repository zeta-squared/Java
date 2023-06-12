package file;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class ReadFile {
	public ArrayList<Double> readValues(String filename) 
		throws IOException { 
		ArrayList<Double> doubleList = new ArrayList<>();
		File currentDir = new File("./" + filename);

		Scanner in = new Scanner(currentDir.getCanonicalFile());
		while (in.hasNext()) {
			if (in.hasNextDouble() || in.hasNextFloat()) {
				doubleList.add(Double.valueOf(in.next()));
			} else {
				throw new IllegalArgumentException();
			}
		}

		return doubleList;
	}

	public double sumOfValues(String filename) 
		throws IOException {
		ArrayList<Double> fileNumbers = readValues("numbers.txt");
		double sum = 0.0;
		for (int i = 0; i < fileNumbers.size(); i++) {
			sum += fileNumbers.get(i);
		}
		return sum;
	}

	public static void main(String[] args) {
		ReadFile file = new ReadFile();
		try {
			System.out.printf("%.2f\n", file.sumOfValues("numbers.txt"));
		} catch (IOException ex) {
			if (ex instanceof FileNotFoundException exc)
				System.err.println("Caught FileNotFoundException: make sure the file is in " +
						"the parent directory of the class.");

			ex.toString();
		} catch (IllegalArgumentException ex) {
			System.err.println("Caught IllegalArgumentException: ensure that all entries of your file " +
					"can be represented as a float/double");
		}
	}
}
