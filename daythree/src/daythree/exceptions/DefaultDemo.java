package daythree.exceptions;

public class DefaultDemo {

	public static void main(String[] args) {
		try {
		String str = null;
		str.equals("Hello");
		}catch(NullPointerException npe) {//Its not recommended to catch the NPE
			npe.printStackTrace();
		}
		System.out.println("I am in a default demo");
		
		int arr2d[][];
	}

}
