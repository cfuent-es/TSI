public class ThreadMemoryInconsistence {
	static int counter = 0;

	static class MyThreadA implements Runnable {
		@Override
		public void run() {
			for (int x = 0; x < 10000; x++)
				counter++;
		}
	}

	static class MyThreadB implements Runnable {
		@Override
		public void run() {
			for (int x = 0; x < 10000; x++)
				counter--;
		}
	}
	// ...
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Count: " + counter);
		Thread t1 = new Thread(new MyThreadA());
		Thread t2 = new Thread(new MyThreadB());
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Count: " + counter);
	}
}
