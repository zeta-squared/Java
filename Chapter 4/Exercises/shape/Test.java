package shape;

import point.Point;

public class Test {
	public static void main(String[] args) {
		Point point = new Point(0, 1);
		Circle circle = new Circle(point, 2);
		Rectangle rectangle = new Rectangle(point, 0.1, 1.2);
		Line line = new Line(point, new Point(2, 3.1)); 

		/* test getCentre method */
		System.out.println("The centre of the circle is " + circle.getCentre().toString());
		System.out.println("The centre of the rectangle is " + rectangle.getCentre().toString());
		System.out.println("The centre of the line is " + line.getCentre().toString());

		/* test moveBy method */
		circle.moveBy(1.32, 0.19);
		System.out.println("The centre of the circle is " + circle.getCentre().toString());
	}
}
