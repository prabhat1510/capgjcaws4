package dayeight.threadexample.shareddata;

public class MyThread extends Thread{
	private Display display;
	private String name;
	public MyThread(Display display, String name) {
		this.display = display;
		this.name = name;
	}
	
	public void run() {
		display.wish(name);
	}
}
