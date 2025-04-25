package aula09;

import java.util.Random;
import java.util.concurrent.RecursiveAction;

public class CreateTask extends RecursiveAction {
	private static final long serialVersionUID = 1L;

	static final int SEQUENTIAL_THRESHOLD = 5000;

	int low;
	int high;
	int[] array;

	CreateTask(int[] arr, int size) {
		low = 0;
		high = size;
		array = arr;
	}

	private CreateTask(int[] arr, int lo, int hi) {
		array = arr;
		low = lo;
		high = hi;
	}

	protected void compute() {	// método principal da RecursiveAction
		if (high - low <= SEQUENTIAL_THRESHOLD) {
			Random r = new Random();
			for (int i = low; i < high; ++i)
				array[i] = r.nextInt();
		} else {
			int mid = low + (high - low) / 2;
			CreateTask left = new CreateTask(array, low, mid);
			CreateTask right = new CreateTask(array, mid, high);
			left.fork();	// inicia uma nova thread
			right.compute();
			left.join();	// bloqueia até que a sub-tarefa seja concluída
		}
	}
}
