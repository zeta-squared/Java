import java.util.Arrays;
import java.util.Comparator;

public interface Measurable {
	public double getMeasure();

	default public double average(Measurable[] objects) {
		double sumMeasure = 0;
		for (int i = 0; i < objects.length; i++)
			sumMeasure += objects[i].getMeasure();
		
		return sumMeasure / (double) objects.length;
	}

	default public Measurable largest(Measurable[] objects) {
		Arrays.sort(objects, Comparator.comparing(Measurable::getMeasure).reversed());
		return objects[0];
	}
}
