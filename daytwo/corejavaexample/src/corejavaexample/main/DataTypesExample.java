package corejavaexample.main;

public class DataTypesExample {
	/**
	 * 
	 * @param args
	 * 
	 * There are three kinds of variables in Java:-
	 * Local Variables
	 * Instance Variables
	 * Class/Static Variables
	 */
	public static void main(String[] args) {
		//declaring number variable of int data type
		int number = 0;
		//declaring and initializign num1 and num2 variable of int data type
		int num1=10 , num2=20;
		//declaring num variable of float data type
		float num = 0;
		//declaring pi variable and initialized with double data 
		double pi=3.14159;
		//the char variable c is initialized with value 'c'
		char c='c';
		
		//initialized a byte type variable b
		byte b =22;
		
		boolean flag = false;
		
		System.out.println(number);
		System.out.println(num1+"---"+num2);
		System.out.println(num);
		System.out.println(flag);
		//System.out.println(num11);
	}
	
	
	public int addition(int num11,int num22) {
		//System.out.println(number);
		return num11+num22;
	}

}
