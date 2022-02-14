package dayeight.threadexample;

public class HelloThreadDemo {

	public static void main(String[] args) {
		HelloThread ht = new HelloThread();
		ht.start();//Invoking run method of the HelloThread class
		System.out.println(ht.getId());
		System.out.println(ht.getName());
		System.out.println(ht.getThreadGroup());
		System.out.println(ht.getState());
		
		//Thread runs in a priority level- starts from 1 to 10
		System.out.println(ht.getPriority());
	
	}

}
