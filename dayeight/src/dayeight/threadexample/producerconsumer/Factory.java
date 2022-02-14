package dayeight.threadexample.producerconsumer;

public class Factory {
	int n;
	boolean valueSet;
	
	synchronized int get() {
		if(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Got: "+n);
		valueSet=false;
		notify();
		return n;
	}
	
	synchronized void put(int n) {
		this.n=n;
		System.out.println("Put: "+n);
	}
}
