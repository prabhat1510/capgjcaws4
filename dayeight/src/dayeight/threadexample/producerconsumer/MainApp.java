package dayeight.threadexample.producerconsumer;

public class MainApp {

	public static void main(String[] args) {
		Factory factory = new Factory();
		Producer producer = new Producer(factory);
		Consumer consumer = new Consumer(factory);
		producer.start();
		consumer.start();
	}

}
