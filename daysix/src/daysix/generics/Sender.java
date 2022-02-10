package daysix.generics;
//Sender class is declared as parameterized generic type of one parameter as "T"
//The "T" in diamond operator refers as generic type of message.
public class Sender<T> {
	private T message;

	public T getMessage() {
		return message;
	}

	public void setMessage(T message) {
		this.message = message;
	}
	
	public void sendMessage() {
		//logic to send message
		
		System.out.println("Message sent"+this.getMessage());
	}

}
