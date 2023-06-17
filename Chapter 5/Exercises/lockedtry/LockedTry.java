package lockedtry;

import java.util.Scanner;
import java.nio.file.Path;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

public class LockedTry {
	public static void main(String[] args) {
		try (var lock = newLock(); var in = new Scanner(Path.of("/home/zeaiter/"))) {
			System.out.println("try something");
		} catch (IOException ex) {
			System.err.println("Caught IOException: " + ex.getMessage());
		}
	}

	public static AutoCloseableLock newLock() {
		AutoCloseableLock lock = new AutoCloseableLock();
		lock.lock();
		return lock;
	}
}

class AutoCloseableLock
	extends ReentrantLock
	implements AutoCloseable {
	@Override
	public void close() {
		this.unlock();
	}
}
