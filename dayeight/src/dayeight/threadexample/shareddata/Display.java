package dayeight.threadexample.shareddata;

public class Display {
	//Synchronized method
	public synchronized void wish(String name) {
		for(int i=0;i<10;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}

}
