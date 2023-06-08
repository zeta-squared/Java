public class Manager extends Employee {
	Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
	}

	public double getBonus() {
		return 2;
	}
}
