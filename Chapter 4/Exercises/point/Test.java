package point;

public class Test {
	public static void main(String[] args) {
		LabeledPoint point = new LabeledPoint("vertex", 1.2, 2.1);
		System.out.printf("%s is at (%.2f, %.2f)\n",
				point.getLabel(), point.getX(), point.getY());
	}
}
