package aula02;

import java.util.Random;

public class Tarefa implements Runnable {
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		
		System.out.println("Hello thread " + t.getName());
		try {
			Random r = new Random();
			long time = 1000 + r.nextInt(2001);
			
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Encerrando thread " + t.getName());
	}

}
