public class SynchronizedStatementCounter {
	private int c = 0;
	private Object lock = new Object();

	public void increment() {
		synchronized (lock) {
			c++;
		}
	}

	public void decrement() {
		synchronized (lock) {
			c--;
		}
	}

	public int value() {
		return c;
	}
}
