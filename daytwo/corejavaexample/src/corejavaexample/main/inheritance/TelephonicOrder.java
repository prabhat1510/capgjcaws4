package corejavaexample.main.inheritance;

public class TelephonicOrder extends Payment{
	
	public void getPaymentByCard() {
		super.receivePayment();
		System.out.println("Received payment by card");
	}
	
	public void getPaymentByCash() {
		super.receivePayment();
		System.out.println("Recieved cash payment");
	}
}
