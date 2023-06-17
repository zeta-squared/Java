package factorial;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(Integer.valueOf(args[0])));
	}

	public static int factorial(int n) {
		if (n == 1) {
			Exception ex = new Exception();
			ex.printStackTrace();

			return n;
		}

		return n * factorial(n - 1);
	}
}
