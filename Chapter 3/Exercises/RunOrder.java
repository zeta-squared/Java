public class RunOrder {
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

		Runnable[] tasks = {firstTask, secondTask, thirdTask};
		Runnable inOrder = order(tasks);
		new Thread(inOrder::run).start();
		return;
	}

	public static Runnable order(Runnable[] tasks) {
		return () -> {
			for (Runnable task : tasks)
				task.run();
		};
	}
}
