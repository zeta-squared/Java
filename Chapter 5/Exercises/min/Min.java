package min;

public class Min {
	public static void main(String[] args) {
		int[] values = {8, 92, 83, 672, 16, 28, 18, 3, 29, 209, 190, 87, 5, 39, 20};
		System.out.println(min(values));
	}

	public static int min(int[] values) {
		if (values.length == 0)
			throw new IllegalArgumentException("Array cannot be empty");

		int min = values[0];
		for (int i = 1; i < values.length; i++)
			min = min > values[i] ? values[i] : min;

		assert checkMin(values, min);
		return min;
	}

	public static Boolean checkMin(int[] values, int min) {
		for (int value : values) {
			if (min > value) {
				return false;
			}
		}

		return true;
	}
}
