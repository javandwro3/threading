package pl.jwrabel.trainings.javandwro3.threading;

/**
 * Created by jakubwrabel on 17/05/2017.
 */
public class Threading2 {
	public static void main(String[] args) {

		System.out.println("Startujemy nowy wątek");
		Thread thread = new Thread(){
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					return;
				}
				System.out.println("Hello from new Thread");
			}
		};
		thread.start();
		System.out.println("Wątek wystartowany");

		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Wątek zakończony");

		// PRZERWANIE WĄTKU
//		thread.interrupt();




	}
}
