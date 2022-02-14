package dayeight.threadexample.producerconsumer;

public class Producer extends Thread{
	private Factory factory;
	
	public Producer(Factory factory) {
		this.factory = factory;
	}

	public void run() {
		for(int i=0;i<14;i++) {
		factory.put(i);
		}
	}

}
