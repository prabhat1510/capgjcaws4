package daysix.generics;

public class Mammal {
	private String type;

	public Mammal(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Mammal [type=" + type + "]";
	}
	
}
