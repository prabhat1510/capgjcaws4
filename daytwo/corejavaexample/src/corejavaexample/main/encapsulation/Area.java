package corejavaexample.main.encapsulation;

/**
 * 
 * @author UD SYSTEMS
 *
 * Encapsulation is one of the key features of OOP
 * It refers to the bundling of fields and methods inside a single class.
 * It prevents outer classes from accessing and changing fields and methods of a class.
 */
public class Area {
	
	private int length;
	private int breadth;
	
	public Area(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void getArea() {
		int area = length*breadth;
		System.out.println("Area :-- "+area);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

}
