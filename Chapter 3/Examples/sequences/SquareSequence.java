package sequences;

public class SquareSequence implements IntSequence {
	private int i;

	public boolean hasNext() {
		return true;
	}

	public int next() {
		i++;
		return i * i;
	}
}
