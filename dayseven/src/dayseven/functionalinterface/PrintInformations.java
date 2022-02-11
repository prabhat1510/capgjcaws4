package dayseven.functionalinterface;

//Non functional Interface
public interface PrintInformations {
	//If one single abstract method is present in an Interface then this interface will be known as functional interface
	public void printMessage(String message);
	
	//If you have more than one abstract method then this interface will be non functional interface
	public void printMessageTwo(String message);
}
