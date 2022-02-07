package daythree.exceptions;

public class UserDefinedDemo {

	public static void main(String[] args) {
		int age=8;
		try {
			if(age<18) {
				throw new AgeException(age);
			}
		}catch(AgeException ae) {
			ae.printStackTrace();
		}

	}

}
