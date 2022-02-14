package dayeight.threadexample.lifecycle;

public class MyThread extends Thread{
	public void run() {
		System.out.println("In side run() Thread is alive or not " + this.isAlive());
		int num = 0;
		while (num < 4) {
			num++;
			System.out.println("num = " + num);
			try {
				sleep(500);
				System.out.println("In not runnable stage, Thread is alive or not " + this.isAlive());
			} catch (InterruptedException exp) {
				System.err.println("Thread Interrupted ...");
			}
		}
	}
}
