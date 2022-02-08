package dayfour.stringexample;

public class StringDemo {

	public static void main(String[] args) {
		//In English String - group of characters
		//In Java String is an object that represents sequence of char values. An array of character.
		char[] c = {'H','e','l','l','o'};
		String str = new String(c);// String is handled as an object of class String and not as an array of characters
		String s = "Hello";//s is referring to new object whose value is "Hello"
		if("hello" instanceof String) {
			System.out.println(true);
		}
		s="Hi";//s is now referring to new object whose value is "Hi"
		System.out.println(s);
	}

}
