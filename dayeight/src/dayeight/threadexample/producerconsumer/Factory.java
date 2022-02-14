package dayeight.threadexample.producerconsumer;

public class Factory {
	int n;
	boolean valueSet=true;
	
	synchronized int get() {
		if(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Got: "+n);
		valueSet=true;
		notifyAll();
		return n;
	}
	
	synchronized void put(int n) {
		if(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		this.n=n;
		System.out.println("Put: "+n);		
		valueSet=false;
		notifyAll();
	}
}
