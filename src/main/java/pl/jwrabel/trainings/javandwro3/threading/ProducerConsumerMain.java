package pl.jwrabel.trainings.javandwro3.threading;

/**
 * Created by jakubwrabel on 18.03.2017.
 */
public class ProducerConsumerMain {
	public static void main(String[] args) {
		MyMessage message = new MyMessage();

		MyConsumer consumer = new MyConsumer(message);
		MyProducer producer = new MyProducer(message);
		consumer.start();
		producer.start();


	}
}
