package dayfour.stringexample;

public class StringOperations {

	public static void main(String[] args) {
		String str ="Core";// new String("Core") - that means new object will be created in the String pool
		String s="Core";
		String s2 = new String("Core");
		System.out.println(s2.hashCode());
		System.out.println(s.hashCode());
		System.out.println(str.hashCode());
		s="Hi";
		System.out.println("s---"+s.hashCode());
		String s1 =s.replace('i', 'a'); //Its creating new string object referred by s1.
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s.hashCode());
	}

}
