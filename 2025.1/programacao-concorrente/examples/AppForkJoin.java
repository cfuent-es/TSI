package aula09;

import java.util.concurrent.ForkJoinPool;

public class AppForkJoin {
	static ForkJoinPool fjPool = new ForkJoinPool();

	static long sumArray(int[] array) {
		return fjPool.invoke(new SumTask(array, 0, array.length));
	}

	static void createArray(int[] array) {
		fjPool.invoke(new CreateTask(array, array.length));
	}

	public static void main(String args[]) {
		int[] array = new int[44000000];
		System.out.println("Iniciando...");
		createArray(array);
		long sum = sumArray(array);
		System.out.printf("a soma dos %d números inteiros do array é %d\n", array.length, sum);
	}
}
