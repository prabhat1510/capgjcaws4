package dayeight.threadexample.lifecycle;

public class ThreadA implements Runnable {

	@Override
	public void run() {
		//moving thread tA to the state timed waiting
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The state of thread tB whilke it invoked the method join() on thread tA:--"+ThreadADemo.tB.getState());
	
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
