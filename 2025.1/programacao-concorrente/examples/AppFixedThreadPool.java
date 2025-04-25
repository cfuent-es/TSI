package aula09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppFixedThreadPool {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable task = new MyTask();
			executor.execute(task);
		}

		executor.shutdown();
		while (!executor.isTerminated())
			Thread.sleep(100);

		System.out.println("Finished all threads");
	}
}
