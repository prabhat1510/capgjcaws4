package dayfour.stringexample;

public class EmployeeDemo {
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setEmpId(1);
		e2.setEmpId(1);
		/**
		 * If two objects are equal according to the equals() method, then calling
		 * the haschCode() on each of the two objects must produce the same integer result
		 */
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println(e1);
	}

}
