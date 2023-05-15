import java.util.Arrays;
import java.util.Comparator;
import java.time.LocalDate;
import java.time.Period;

public interface Service {
	public Period getService();

	default public void average(Service[] objects) {
		double tYears = 0;
		double tMonths = 0;
		double tDays = 0;
		LocalDate today = LocalDate.now();

		for (int i = 0; i < objects.length; i++) {
			tYears += (double) objects[i].getService().getYears();
			tMonths += (double) objects[i].getService().getMonths();
			tDays += (double) objects[i].getService().getDays();
		}

		tYears /= (double) objects.length;
		tMonths /= (double) objects.length;
		tDays /= (double) objects.length;

		System.out.printf("The average employee service is %.2f years, %.2f months and %.2f days\n",
				tYears, tMonths, tDays);
		return;
	}

	default public Service longest(Service[] objects) {
		Arrays.sort(objects,
				Comparator.comparing(
					Service::getService, (x, y) -> x.getYears() - y.getYears()
					).thenComparing(
						Service::getService, (x, y) -> x.getMonths() - y.getMonths()
						).thenComparing(
							Service::getService, (x, y) -> x.getDays() - y.getMonths()
							).reversed()
				);
		return objects[0];
	}
}
