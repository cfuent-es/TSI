import java.util.ArrayList;

public class JoinThread {
	static class Counter implements Runnable {
		String sCount[] = { "zero", "um", "dois", "três", "quatro", "cinco" };

		public void run() {
			try {
				for (int i = 0; i < 6; i++) {
					System.out.printf("%s: %s\n", Thread.currentThread().getName(), sCount[i]);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				System.out.printf("%s: finalizada.\n", Thread.currentThread().getName());
			}
		}
	}

//	// aguardando uma única thread
//	public static void main(String Args[]) {
//		Thread t = new Thread(new Counter());
//		t.start();
//		System.out.printf("%s: %s foi iniciada\n", Thread.currentThread().getName(), t.getName());
//		try {
//			t.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.printf("%s: %s já finalizou.\n", Thread.currentThread().getName(), t.getName());
//	}

	// aguardando várias threads
	public static void main(String Args[]) {
		ArrayList<Thread> threads = new ArrayList<Thread>();
		for (int i = 0; i < 10; i++) { // iniciando várias threads
			Thread t = new Thread(new Counter());
			t.join();
			System.out.printf("%s: %s foi iniciada\n", Thread.currentThread().getName(), t.getName());
			threads.add(t);
		}
		for (int i = 0; i < 10; i++) {
			try {
				threads.get(i).join(); // aguardando as threads iniciadas
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("%s: %s já finalizou.\n", Thread.currentThread().getName(),
					threads.get(i).getName());
		}
	}
}