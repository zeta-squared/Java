package sequences;

public interface IntSequence {
	public boolean hasNext();
	public int next();

	default public static double average(IntSequence sequence, int n) {
		int count = 0;
		double sum = 0;
		while(sequence.hasNext() && count < n) {
			count++;
			sum += sequence.next();
		}
		return count == 0 ? 0 : sum / count;
	}
}
