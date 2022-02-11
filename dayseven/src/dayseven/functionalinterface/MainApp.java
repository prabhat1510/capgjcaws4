package dayseven.functionalinterface;

public class MainApp {

	public static void main(String[] args) {
		PrintInformationImpl pii = new PrintInformationImpl();
		pii.printMessage("I am functional interface");//calling normal method
		PrintInformation.printInformation();//calling static method
		
		System.out.println("******************************");
		VisualizeInfoImpl vii = new VisualizeInfoImpl();
		vii.printVisualInformation();
		vii.visualInfo();

	}

}
