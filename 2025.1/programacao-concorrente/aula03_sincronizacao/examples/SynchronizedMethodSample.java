public class SynchronizedMethodSample {
	public static void main(String[] args) throws InterruptedException {
		SynchronizedCounter counter = new SynchronizedCounter();
		System.out.println("Starting Count: " + counter.value());
		Thread t1 = new Thread(new MyThreadX(counter));
		Thread t2 = new Thread(new MyThreadX(counter));
		Thread t3 = new Thread(new MyThreadX(counter));
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Stopping Count: " + counter.value());
	}
}
