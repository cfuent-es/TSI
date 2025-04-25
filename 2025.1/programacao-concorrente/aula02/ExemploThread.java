package aula02;

import java.util.ArrayList;

public class ExemploThread {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Sem sincronização da t2.
		 * Caso t1 terminar antes de t2, a aplicação main() apresenta "Fim"
		 * antes de realmente a t2 encerrar.
		 * DAQUI */
//		Thread t1 = new Thread(new Tarefa());
//		t1.start();
//		t1.setName("Thread 1");
//		
//		Thread t2 = new Thread(new Tarefa());
//		t2.setName("Thread 2");
//		t2.start();
//		t1.join();
		/* ATÉ AQUI */
		
		/*
		 * Sincronização de todas as threads antes de apresentar "Fim"
		 * */
		ArrayList<Thread> threads = new ArrayList<Thread>();
		for(int i = 0; i < 5; i++) {
			Thread t = new Thread(new Tarefa());
			t.setName("Thread " + i);
			t.start();
			threads.add(t);
		}
		
		for(int i = 0; i < 5; i++ ) {
			threads.get(i).join();
		}
		/* ATÉ AQUI */
		

		
		
		System.out.println("Fim");
	}

}
