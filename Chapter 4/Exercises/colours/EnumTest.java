package colours;

public class EnumTest {
	public static void main(String[] args) {
		for (Colour colour : Colour.values())
			System.out.println(colour.toString());
	}

	public enum Colour {
		BLACK(0, 0, 0), RED(255, 0, 0), BLUE(0, 0, 255), GREEN(0, 0, 255), CYAN(0, 255, 255),
		MAGENTA(255, 0, 255), YELLOW(255, 255, 0), WHITE(255, 255, 255);

		private int red;
		private int green;
		private int blue;

		Colour(int red, int green, int blue) {
			this.red = red;
			this.green = green;
			this.blue = blue;
		}

		public int getRed() { return this.red; }
		public int getGreen() { return this.green; }
		public int getBlue() { return this.blue; }

		@Override
		public String toString() {
			return this.name() + "[rgb(" + getRed() + ", " + getGreen() + ", " + getBlue() + ")]";
		}
	}
}
