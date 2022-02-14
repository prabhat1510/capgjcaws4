package dayeight.threadexample.executor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyThread {

	public static void main(String[] args) {
		Runnable task=()->System.out.println("Hello World");
		Thread thread = new Thread(task);
		thread.start();
		
		Executor executor = Executors.newSingleThreadExecutor();//Create a pool with only one thread in it 
		Runnable task2=()->System.out.println("I Run");
		executor.execute(task2);
		
		//This will create a pool with only one thread in it
		//A pool of Thread is an instance of Executor Interface
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
		
		//Creates a pool with 8 threads
		ExecutorService fixedThreadExecutor = Executors.newFixedThreadPool(8);
		
		Runnable task3=()->System.out.println("Some really long process");
		Runnable task4=()->System.out.println("Another really long process");
		
		singleThreadExecutor.execute(task3);
		singleThreadExecutor.execute(task4);
		
		//Get ExecutorService from Executors utility class, thread pool size is 10
        ExecutorService exec = Executors.newFixedThreadPool(10);
        //create a list to hold the Future object associated with Callable
        List<Future<String>> list = new ArrayList<Future<String>>();
        //Create MyCallable instance
        Callable<String> callable = new MyCallable();
        for(int i=0; i< 100; i++){
            //submit Callable tasks to be executed by thread pool
            Future<String> future = exec.submit(callable);
            //add Future to the list, we can get return value using Future
            list.add(future);
        }
        
        for(Future<String> fut : list){
            try {
                //print the return value of Future, notice the output delay in console
                // because Future.get() waits for task to get completed
                System.out.println(new Date()+ "::"+fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        //shut down the executor service now
        exec.shutdown();
    }
	

}
