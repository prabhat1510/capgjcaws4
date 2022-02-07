package daythree.abstraction;

public class UPIPayment implements PaymentInterface , PaymentInfo{

	@Override
	public void recievePayment() {
		System.out.println("Recieve payment using UPI");
	}

	@Override
	public void displayPaymentInformation() {
		System.out.println("Displaying payment information");

	}
	
	public void displayInfo() {
		System.out.println("I am display info");
	}

}
