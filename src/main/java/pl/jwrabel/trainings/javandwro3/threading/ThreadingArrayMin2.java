package pl.jwrabel.trainings.javandwro3.threading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jakubwrabel on 17/05/2017.
 */
public class ThreadingArrayMin2 {

	private final static int THREADS_NUMBER = 4;

	public static void main(String[] args) throws InterruptedException {
		int[] data = new int[1_000_000];

		Random random = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt();
		}

		List<MinThread> threads = new ArrayList<>();

		threads.add(new MinThread(data, 0, data.length/2));
		threads.add(new MinThread(data, data.length/2, data.length));

		for (MinThread thread : threads) {
			thread.start();
		}

		for (MinThread thread : threads) {
			thread.join();
		}

//
//		int min = thread1.getMin()  < thread2.getMin() ? thread1.getMin() : thread2.getMin();
//
//		System.out.println("Minimalna wartość w tablicy: " + min);


	}
}
