package sequences;

public class SequenceTest {
	public static void main(String[] args) {
		SquareSequence sequence = new SquareSequence();
		System.out.printf("The average of the next 100 terms is %.2f\n",
				IntSequence.average(sequence, 100));
	}
}
