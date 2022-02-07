package daythree.interfaces;

public class DefaultMethodDemo {

	public static void main(String[] args) {
		DisplayMessageImpl dmi = new DisplayMessageImpl();
		dmi.displayMessage("Hello Everyone"); //calling abstract method
		dmi.displayMessageMore(); //calling default method
		DisplayMessage.displayProperly("We are learning interfaces"); //calling static method
	}

}
