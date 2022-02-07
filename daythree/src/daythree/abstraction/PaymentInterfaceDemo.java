package daythree.abstraction;

public class PaymentInterfaceDemo {

	public static void main(String[] args) {
		UPIPayment upiPayment = new UPIPayment();
		upiPayment.displayPaymentInformation();
		upiPayment.recievePayment();
	}

}
