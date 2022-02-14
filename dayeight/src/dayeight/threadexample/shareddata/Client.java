package dayeight.threadexample.shareddata;

public class Client {
	//Shared data without synchronization
	public static void main(String[] args) {
		Display display = new Display();
		MyThread myThread1= new MyThread(display,"Dhoni");
		MyThread myThread2= new MyThread(display,"Kohli");	
		System.out.println("Before myThread1 is started the state is ----"+myThread1.getState());
		myThread1.start();
		System.out.println("After myThread1 is started the state is ----"+myThread1.getState());
		System.out.println("Before myThread2 is started the state is ----"+myThread2.getState());
		myThread2.start();
		System.out.println("After myThread2 is started the state is ----"+myThread2.getState());
	}

}
