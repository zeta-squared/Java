public class EmployeeTest {
	public static void main(String[] args) {
		Employee jim = new Manager("Jim", 42000, 2011, 5, 21);
		System.out.println(jim.toString());
		if (jim instanceof Manager mng) {
			System.out.println(mng.getBonus());
		}
	}
}
