package corejavaexample.main.inheritance;
//derived class or subclass or child class or Derived class is inheriting the Base using the extends keyword
public class Derived extends Base {
	
	public void derivedMethod() {
		super.baseMethod();
		System.out.println("Derived");
	}
}
