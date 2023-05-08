import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;

	Employee(String name, double salary, int year, int month, int day) {
		this.name = Objects.requireNonNull(name, "The name cannot be null");
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}

	public String getHireDay() {
		return hireDay.toString();
	}

	public void raiseSalary(double raise) {
		this.salary *= (1.0 + (raise/100.0));
	}
}
