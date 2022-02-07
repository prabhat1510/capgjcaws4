package daythree.exceptions;

//User Defined or custom exception
public class AgeException extends Exception{
	
	private int age;
	AgeException(int a){
		age=a;
	}
	
	public String toString() {
		return age + "is an invalid age";
	}

}
