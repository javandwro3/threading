package pl.jwrabel.trainings.javandwro3.threading;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubwrabel on 17/05/2017.
 */
public class ThreadingSynchro {
	public static void main(String[] args) throws InterruptedException {
		List<Integer> integers = new ArrayList<>();
		Object lock = new Object();

		int i = 1;
		i += 1;

		Thread thread = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 2_000_000; i++) {

					synchronized (lock) {
						integers.add(i);
					}
				}
			}
		};
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				for (int i = 2_000_000; i < 4_000_000; i++) {

					synchronized (lock) {
						integers.add(i);
					}
				}
			}
		};
		thread.start();
		thread2.start();
		thread.join();
		thread2.join();

		System.out.println("Rozmiar listy: " + integers.size());

	}
}
