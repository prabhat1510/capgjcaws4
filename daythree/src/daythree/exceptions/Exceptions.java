package daythree.exceptions;

public class Exceptions {

	public static void main(String[] args) {
		
		int i=15;
		int result = 0;
		//result =i/3;
		try {
			result =i/0;//Division by zero
		}catch(ArithmeticException ae) { //Exception Handler for Type Arithmetic Exception
			ae.printStackTrace();
		}finally {
			System.out.println("I am inside finally block");
		}
		
		//Reading data from a file.
		//Referring to non-existing item in array
		System.out.println("Division completed, result is ----"+result);
		
		System.out.println(divide(15,0));
	}
	
	public static int divide(int x,int y) {
		int ans = 0;
		try {
			ans=x/y;
		}catch(Exception e) {
			ans=0;
		}finally {
			return ans; //This is always executed
		}
	}

}
