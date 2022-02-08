package dayfour.stringexample;

public class StringComaprison {
	//In Java we can compare String on the basis of content and reference
	//By using equals() method
	//By using == Operator
	//By compareTo() method --- in sorting 
	public static void main(String[] args) {
		String str = "Hello";
		String s="Hello";
		String s1= new String("Hello");//str==s1 false
		//String s1= new String(str);//str==s1 false
		//String s1="Hello"; //str==s1 true
		System.out.println(s==str); //Compares references not values
		System.out.println(s.equals(str));// Compares values of string of equality
		
		System.out.println(str==s1); //false  -- references are different
		System.out.println(str.equals(s1));
		
		System.out.println(str.hashCode());
		System.out.println(s1.hashCode()); // hashcode are same
		
		System.out.println("****************************");
		String helloWorld = "Hello World";
		String[] helloWorldSplitted =helloWorld.split("\\s");
		System.out.println(System.identityHashCode(helloWorld));
		System.out.println("Hashcode method value ----"+helloWorld.hashCode());
		for(String st:helloWorldSplitted) {
			System.out.println(st);
			System.out.println(System.identityHashCode(st));
			System.out.println("Hashcode method value ----"+st.hashCode());
		}
	}

}
