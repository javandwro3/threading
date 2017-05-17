package pl.jwrabel.trainings.javandwro3.threading;

/**
 * Created by jakubwrabel on 17/05/2017.
 */
public class ExampleThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Example Thread " + i);
		}
	}
}
