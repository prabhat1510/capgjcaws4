package daythree.wrapper;

public class WrapperClassesExample {

	public static void main(String[] args) {
		
		Integer a =10;
		//Integer() constructor is deprecated since Java 9 so we should not use it
		//Integer b= new Integer(15);
		Integer c = Integer.valueOf(11);
		System.out.println(c instanceof Integer);
		System.out.println(a instanceof Integer);
		
		
		Float d = 12.45f;
		//Float e = new Float(12.12f);
		Float f= Float.valueOf(23.32f);
		System.out.println(f instanceof Float);
		
		//Converting a primitive value into an object of the corresponding wrapper class is called autoboxing
		float g = 10.10f; //primitive type
		Float gg=Float.valueOf(g); // gg is an instanceof Float
		
		
		Integer i=100;
		int j=i;// Auto-unboxing
		Integer k=j ;// Autoboxing
		
		Integer l = Integer.valueOf(100);
		int m = l.intValue();// int m=l;
		
		String s ="1234";
		int p= Integer.parseInt(s);
		Integer q = Integer.valueOf(s);
		
		System.out.println(Float.parseFloat(s));

	}

}
