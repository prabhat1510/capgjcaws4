package dayseven.functionalinterface;

public class PrintInformationImpl implements PrintInformation {

	@Override
	public void printMessage(String message) {
		System.out.println("Good Morning please remain awake");
	}

}
