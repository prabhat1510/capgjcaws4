package dayeight.threadexample.lifecycle;

public class ThreadB implements Runnable{

	@Override
	public void run() {
		ThreadA threadA = new ThreadA();
		Thread tA = new Thread(threadA);
		System.out.println("The state of thread tA after spawing it-"+tA.getState());
		tA.start();
		
		System.out.println("The state of thread tA after calling the start() method on it:--"+tA.getState());
		
		try {
			//moving the thread tB to the state timed waiting
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The state of thread tA after calling the sleep() method on it:--"+tA.getState());
		
		//Waiting for thread tA to complete the execution
		try {
			tA.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The state of thread tA when it has completed it's execution:--"+tA.getState());
	}

}
