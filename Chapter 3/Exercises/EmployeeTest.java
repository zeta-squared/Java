public class EmployeeTest {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];

		staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

		staff[0].average(staff);

		for (int i = 0; i < staff.length; i++)
			System.out.printf("%s has salary %.2f\n", staff[i].getName(), staff[i].getSalary());

		System.out.printf("The average salary of these employees is %.2f\n", staff[0].average(staff));
		System.out.printf("The employee with the largest salary is %s\n",
				((Employee) staff[0].largest(staff)).getName()); // The result of Measurable.largest(...) needs
																 // to be cast so the method getName() can be
																 // received by an instance of the Employee
																 // class.
	}
}
