public class Car {
	private double fuel;
	private double distance;
	private final double milesPerGallon;

	public Car(double milesPerGallon) {
		this.milesPerGallon = milesPerGallon;
	}

	public void setDistance(double distance) {
		double fuelNeeded = Math.abs(distance) / milesPerGallon;

		if (fuelNeeded > this.fuel) {
			this.distance += this.milesPerGallon * this.fuel;
			this.fuel = 0.0;
		} else {
			this.distance += distance;
			this.fuel -= fuelNeeded;
		}
	}

	public void addFuel(double fuel) {
		if (fuel >= 0)
			this.fuel += fuel;
	}

	public double getDistance() {
		return Math.abs(distance);
	}

	public double getFuel() {
		return fuel;
	}

	public static void main(String[] args) {
		Car car = new Car(11.76);

		// Test the addFuel method of Car
		System.out.printf("Car currently has %.2f gallons of fuel\n", car.getFuel());
		car.addFuel(21.52);
		System.out.printf("After calling car.addFuel(21.52) the car now has %.2f gallons of fuel\n",
				car.getFuel());

		// Test the setDistance method of Car
		System.out.printf("The car is currently %.2f miles from the origin\n", car.getDistance());
		car.setDistance(-284.57);
		System.out.printf("After calling car.setDistance(-284.57) the cars' current distance " +
				"from the origin is %.2f\n" + "The car now has %.2f gallons of fuel remaining\n",
				car.getDistance(), car.getFuel());

	}
}
