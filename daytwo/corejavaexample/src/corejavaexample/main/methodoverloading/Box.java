package corejavaexample.main.methodoverloading;

/*
 * Overloaded method-  In Java it is possible to define two or more methods with in the same class that share same name,
 * as long as their parameter declarations are different.
 */

public class Box {
	private double doubleValue;
	//Overloaded Constructor
	public Box() {
		//1. Default no-argument constructor
	}
	//Overloaded Constructor
	public Box(double doubleValue) {
		//2. constructor with 1 arg
		this.doubleValue = doubleValue;
	}
	//Overloaded method
	//Assuming box is a rectangle
	public void calculateVolume(int length,int breadth, int height) {
		System.out.println(length*breadth*height);
	}
	//Assuming box is a rectangle
	public void calculateVolume(int length, double height,int breadth) {
			System.out.println(length*breadth*height);
	}
	
	//Assuming box is a square
	public void calculateVolume(int side) {
		System.out.println(side*side*side);
	}
	
		//Assuming box is a square
	public double calculateVolume(double side) {
		System.out.println(side*side*side);
		return side*side*side;
	}
}
