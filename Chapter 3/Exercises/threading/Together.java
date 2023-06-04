package threading;

public interface Together {
	public static void runTogether(Runnable... tasks) {
		for (Runnable task : tasks)
			new Thread(task::run).start();

		return;
	}
}
