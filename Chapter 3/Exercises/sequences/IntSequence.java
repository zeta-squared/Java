package sequences;

import java.util.Arrays;

public interface IntSequence {
	public int next();

	default public boolean hasNext() {
		return true;
	}

	public static double average(IntSequence sequence, int n) {
		int count = 0;
		double sum = 0;
		while(sequence.hasNext() && count < n) {
			count++;
			sum += sequence.next();
		}
		return count == 0 ? 0 : sum / count;
	}

	public static IntSequence of(int... elements) {
		return new IntSequence() {
			private int index = 0;
			private int[] sequence = Arrays.copyOf(elements, elements.length);

			public boolean hasNext() {
				return index < sequence.length ? true : false;
			}

			public int next() {
				index++;
				return index <= sequence.length ? sequence[index-1] : 0;
			}
		};
	}

	public static IntSequence constant(int n) {
		return () -> n;
	}
}
