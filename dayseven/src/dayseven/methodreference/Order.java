package dayseven.methodreference;

public class Order {
	
	private String currency;
	private double amount;
	public Order(String currency, double amount) {
		this.currency = currency;
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Order [currency=" + currency + ", amount=" + amount + "]";
	}
	
	public static void displayCurrency() {
		System.out.println("Static Method display currency");
	}
	
	public void displayAmount() {
		System.out.println(this.amount);
	}

}
