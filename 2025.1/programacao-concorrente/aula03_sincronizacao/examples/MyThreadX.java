class MyThreadX implements Runnable {
	SynchronizedCounter counter = null;

	public MyThreadX(SynchronizedCounter c) {
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
	}
}
