package dayeight.threadexample.collections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueDemo {

	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> priorityBlockingQueue = new ArrayBlockingQueue<Integer>(5);
		
		//Producer Thread
		new Thread(()->
		{
			int i=0;
			try {
				while(true) {
					priorityBlockingQueue.put(++i);
					System.out.println("Added in a queue: "+i);
					Thread.sleep(TimeUnit.SECONDS.toMillis(1));
				}
			}catch(InterruptedException iee) {
				iee.printStackTrace();
			}
		}).start();
		
		//Consumer Thread
				new Thread(()->
				{
					
					try {
						while(true) {
							Integer poll = priorityBlockingQueue.take();
							System.out.println("Polled : "+poll);
							Thread.sleep(TimeUnit.SECONDS.toMillis(2));
						}
					}catch(InterruptedException iee) {
						iee.printStackTrace();
					}
				}).start();
	}

}
