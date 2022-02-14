package dayeight.threadexample.lifecycle;

public class ThreadLifeCycleDemo{
	

	public static void main(String[] args) {
		Thread myThread = new MyThread();
		System.out.println("Before Runnable stage Thread is alive or not : " + myThread.isAlive());
		myThread.start();

		try {
			myThread.sleep(4000);
		} catch (InterruptedException exp) {
			System.err.println("Thread is interrupted !");
		}
//myThread.stop();
		System.out.println("After complete execution of Thread ,it is alive or not " + myThread.isAlive());
	}
}