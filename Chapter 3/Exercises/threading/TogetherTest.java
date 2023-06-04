package threading;

public class TogetherTest implements Together {
	public static void main(String[] args) {
		Runnable firstTask = () -> {
			for (int i = 1; i < 11; i++)
				System.out.println(i);
		};

		Runnable secondTask = () -> {
			int sum = 0;
			for (int i = 1; i < 11; i++)
				sum++;
			
			System.out.println("The sum of the first 10 positive integers is " + sum);
		};

		String[] names = {"Paul", "Jackson", "Peter", "David"};
		Runnable thirdTask = () -> {
			for (String name : names)
				System.out.println(name);
		};

		Together.runTogether(firstTask, secondTask, thirdTask);
		return;
	}
}
