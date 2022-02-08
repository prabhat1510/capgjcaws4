package dayfour.stringexample;

public class StringModificationExample {
	//Added in Java 5
	// java.lang.StringBuffer and java.lang.StringBuilder allow modification to strings  
	
	public static void main(String[] args) {
	String x ="abc";//
	x=x.concat("def");//abcdef
	System.out.println("x= "+x);
	
	StringBuffer sb= new StringBuffer("fgh");
	sb.append("ijk");
	System.out.println("sb=  "+sb);
	//StringBuilder class exactly the same API as the StringBuffer class except:
	// It is not thread safe(not synchronized) . It runs faster than StringBuffer
	sb.insert(2, "Hello");
	System.out.println("sb=  "+sb);
	sb.replace(8, 11, " hi");
	System.out.println("sb=  "+sb);
	sb.delete(0, 2);
	System.out.println("sb=  "+sb);
	sb.reverse();
	System.out.println("sb=  "+sb);
	System.out.println(sb.capacity());
	
	StringBuffer sbuff = new StringBuffer(); //16
	System.out.println("Default capacity -----"+sbuff.capacity());
	sbuff.append("lunch");//capacity still 16
	System.out.println(" capacity -----"+sbuff.capacity());
	System.out.println(sbuff);
	sbuff.append("Its lunch time"); //(16*2)+2=34
	System.out.println(" capacity -----"+sbuff.capacity());
	}

}
