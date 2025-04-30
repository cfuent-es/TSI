public class SynchronizedStatementExample {
	public static void main(String[] args) throws InterruptedException {
		SynchronizedStatementCounter counter = new SynchronizedStatementCounter();
		System.out.println("Count: " + counter.value());
		Thread t1 = new Thread(new MyThreadY(counter));
		Thread t2 = new Thread(new MyThreadY(counter));
		Thread t3 = new Thread(new MyThreadZ(counter));
		t1.setName("Thread-Y1"); t1.start();
		t2.setName("Thread-Y2"); t2.start();
		t3.setName("Thread-Z");  t3.start();
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Count: " + counter.value());
	}
}
