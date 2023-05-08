/** Exercise 3
 *
 * An example class with a mutator that returns something other than
 * {@code void}. While the reciprocal could be done for an accessor,
 * that is, an accessor that returns {@code void}, it is redundant as
 * that method would no longer be an accessor.
 *
 */
public class TestExample {
	public static void main(String[] args) {
		Example example = new Example(1);
		String string = example.setInt(2);

		System.out.println(string);
	}
}

class Example {
	private int n;

	Example(int n) {
		this.n = n;
	}

	public String setInt(int n) {
		this.n = n;
		return "Class int set to " + this.n;
	}
}
