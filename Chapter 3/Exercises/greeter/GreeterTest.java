package greeter;

public class GreeterTest {
	public static void main(String[] args) {
		Runnable firstGreeter = new Greeter(10, "John");
		Runnable secondGreeter = new Greeter(5, "Sam");

		new Thread(firstGreeter::run).start();
		new Thread(secondGreeter::run).start();

		return;
	}
}
