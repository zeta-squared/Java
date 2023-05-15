package sequences;

import java.math.BigInteger;

public class SquareSequence implements Sequence<BigInteger> {
	private BigInteger i = BigInteger.valueOf(1);

	public boolean hasNext() {
		return true;
	}

	public BigInteger next() {
		BigInteger square = i.multiply(i);
		i = i.add(BigInteger.valueOf(1));
		return square;
	}

	public static void main(String[] args) {
		System.out.println("Testing Sequence<T> interface with square sequences:");
		SquareSequence sSequence = new SquareSequence();
		for (int i = 0; i < 25; i++)
			System.out.printf("%s, ", sSequence.next().toString());
		System.out.printf("%s\n", sSequence.next().toString());
	}
}
