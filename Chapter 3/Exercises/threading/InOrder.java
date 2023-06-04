package threading;

public interface InOrder {
	public static void runInOrder(Runnable... tasks) {
		for (Runnable task : tasks)
			task.run();

		return;
	}
}
