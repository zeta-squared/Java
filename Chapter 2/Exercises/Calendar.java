/** Exercise 1
 *
 */
import java.time.LocalDate;
import java.time.DayOfWeek;

public class Calendar {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		int month = date.getMonthValue();
		int day = date.getDayOfMonth();

		System.out.println("Sun Mon Tue Wed Thu Fri Sat");

		date = date.minusDays(day - 1);
		DayOfWeek weekday = date.getDayOfWeek();
		int value = (weekday.getValue() + 1) % 8;

		for (int i = 1; i < value; i++)
			System.out.print("    ");

		while(date.getMonthValue() == month) {
			System.out.printf("%3d", date.getDayOfMonth());
			if (date.getDayOfMonth() == day)
				System.out.print("*");
			else
				System.out.print(" ");

			date = date.plusDays(1);
			if (date.getDayOfWeek().getValue() == 7)
				System.out.println();
		}
		System.out.println();
	}
}
