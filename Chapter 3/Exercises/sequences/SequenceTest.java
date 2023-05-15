package sequences;

public class SequenceTest {
	public static void main(String[] args) {
		System.out.println("Testing static IntSequence.of method:");
		IntSequence sequence = IntSequence.of(3, 1, 4, 1, 5, 9);
		while (sequence.hasNext()) {
			int i = sequence.next();
			if (sequence.hasNext())
				System.out.printf("%d, ", i);
			else
				System.out.printf("%d\n", i);
		}

		System.out.println("Testing static IntSequence.constant method:");
		IntSequence constant = IntSequence.constant(1);
		for (int i = 0; i < 25; i++)
			System.out.printf("%d, ", constant.next());
		System.out.printf("%d\n", constant.next());
	}
}
