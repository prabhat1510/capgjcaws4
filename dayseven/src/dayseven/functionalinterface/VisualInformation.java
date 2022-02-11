package dayseven.functionalinterface;

/**
public interface VisualInformation{
	//abstract method inside a functional interface
	public void printVisualInformation();
}**/

public interface VisualInformation {
	public default void printVisualInformation() {
		System.out.println("Functional Interface is extending non functional interface");
	}
}
