package point;

public class Test {
	public static void main(String[] args) {
		Point point1 = new Point(1.2, 2.1);
		Point point2 = new Point(1.2, 2.1);

		LabeledPoint labeledPoint1 = new LabeledPoint("vertex", 1.2, 2.1);
		LabeledPoint labeledPoint2 = new LabeledPoint("vertex", 1.2, 2.1);

		/* test protected variable access */
		System.out.println("Testing protected accesses on LabeledPoint object: " +
				labeledPoint1.getCoords(labeledPoint1));
		System.out.println("Testing protected accesses on Point object: " +
				labeledPoint1.getCoords(point1));

		/* test toString method */
		System.out.println("Testing toString method:");
		System.out.println("\t" + point1.toString());
		System.out.println("\t" + labeledPoint1.toString());

		/* test equals method */
		System.out.println("Testing equality via equals method:");
		System.out.println("\tlabeledPoint1 = point1 : " + labeledPoint1.equals(point1));
		System.out.println("\tpoint1 = point2 : " + point1.equals(point2));
		System.out.println("\tlabeledPoint1 = labeledPoint2 : " + labeledPoint1.equals(labeledPoint2));


		/* test hashCode method */
		System.out.println("Testing equality via hashCode method:");
		System.out.println("\tlabeledPoint1 = point1 : " + (labeledPoint1.hashCode() == point1.hashCode()));
		System.out.println("\tpoint1 = point2 : " + (point1.hashCode() == point2.hashCode()));
		System.out.println("\tlabeledPoint1 = labeledPoint2 : " +
				(labeledPoint1.hashCode() == labeledPoint2.hashCode()));

		/* debug output for hashCode method */
		System.out.println("Debugging hashCode method output: ");
		System.out.println("\tpoint1.hashcode()=" + point1.hashCode() +
				", point2.hashCode()=" + point2.hashCode());
		System.out.println("\tlabeledPoint1.hashcode()=" + labeledPoint1.hashCode() +
				", labeledPoint2.hashCode()=" + labeledPoint2.hashCode());
	}
}
