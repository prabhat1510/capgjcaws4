package corejavaexample.main.inheritance;

public class WalkInCustomer extends Payment{
	
	public void getPaymentByCash() {
		super.receivePayment();
		System.out.println("Cash amount received");
	}
}
