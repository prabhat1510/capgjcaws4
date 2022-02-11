package dayseven.functionalinterface;

@FunctionalInterface
public interface PrintInformation {
	//If one single abstract method is present in an Interface then this interface will be known as functional interface
	public void printMessage(String message);
	
	/**
	 * In a functional interface only one abstract method will be present
	 * You can default and static methods
	 */
	
	public default void  printInfo() {
		System.out.println("I am into default method of functional interface");
	}
	
	public static void printInformation() {
		System.out.println("I am into static method of functional interface");
	}
}
