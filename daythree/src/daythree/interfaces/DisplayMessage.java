package daythree.interfaces;

public interface DisplayMessage {
	//abstract method without body
	public void displayMessage(String message);
	
	//default method java 8 onwards
	default void displayMessageMore() {
		System.out.println("Hello this is your default method");
	}
	//static method java 8 onwards
	public static void displayProperly(String message) {
		System.out.println("Message displayed here in a proper way ----"+message);
	}
	
}
