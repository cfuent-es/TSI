public class MyThreadY implements Runnable {
	SynchronizedStatementCounter counter = null;

	public MyThreadY(SynchronizedStatementCounter c) {
		counter = c;
	}

	@Override
	public void run() {
		for (int x = 0; x < 10000000; x++) {
			counter.increment();
			counter.decrement();
			counter.increment();
			counter.decrement();
		}
		System.out.println(Thread.currentThread().getName() + " finalizou");
	}
}
