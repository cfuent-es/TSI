package aula09;

import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Long> {
	private static final long serialVersionUID = 1L;

	static final int SEQUENTIAL_THRESHOLD = 5000;

	int low;
	int high;
	int[] array;

	SumTask(int[] arr, int lo, int hi) {
		array = arr;
		low = lo;
		high = hi;
	}

	protected Long compute() {	// método principal da RecursiveTask
		if (high - low <= SEQUENTIAL_THRESHOLD) {
			long sum = 0;
			for (int i = low; i < high; ++i)
				sum += array[i];
			return sum;
		} else {
			int mid = low + (high - low) / 2;
			SumTask left = new SumTask(array, low, mid);
			SumTask right = new SumTask(array, mid, high);
			left.fork(); // inicia uma nova thread
			long rightAns = right.compute(); // usa a thread atual para a tarefa da direita
			long leftAns = left.join(); // bloqueia até a finalização da tarefa
			return leftAns + rightAns;
		}
	}
}
