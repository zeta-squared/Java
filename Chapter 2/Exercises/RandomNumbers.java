import java.util.Random;
import java.util.Arrays;

public class RandomNumbers {
	public static final Random generator = new Random();

	public static int nextInt(int low, int high) {
		return low + generator.nextInt(high - low + 1);
	}

	public static int randomElement(int[] n) {
		if (n.length == 0) {
			return 0;
		} else {
			int index = nextInt(0, n.length-1);
			return n[index];
		}
	}

	public static void main(String[] args) {
		int[] n = new int[10];

		for (int i = 0; i < n.length; i++)
			n[i] = nextInt(1, 100);

		System.out.println(Arrays.toString(n));
		System.out.println(randomElement(n));
	}
}
