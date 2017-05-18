package pl.jwrabel.trainings.javandwro3.threading;

import java.util.Random;

/**
 * Created by jakubwrabel on 17/05/2017.
 */
public class ThreadingArrayMin {
	public static void main(String[] args) throws InterruptedException {
		int[] data = new int[1_000_000];

		Random random = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt();
		}


	}
}
