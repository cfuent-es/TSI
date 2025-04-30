public class MyThreadZ implements Runnable {
	SynchronizedStatementCounter counter = null;

	public MyThreadZ(SynchronizedStatementCounter c) {
		counter = c;
	}

	@Override
	public void run() {
		for (int x = 0; x < 10000000; x++) {
			counter.value();
			// System.out.println(" "+counter.value());
		}
		System.out.println(Thread.currentThread().getName() + " finalizou");
	}
}
