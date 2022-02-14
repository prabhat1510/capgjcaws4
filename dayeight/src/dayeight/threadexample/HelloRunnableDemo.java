package dayeight.threadexample;

public class HelloRunnableDemo {

	public static void main(String[] args) {
		HelloRunnable hr = new HelloRunnable();
		Thread helloThread = new Thread(hr);// New Stage or state
		helloThread.start();//thread is runnable stage where run() is invoked
	}

}
