package corejavaexample.main.encapsulation;

public class AreaMain {

	public static void main(String[] args) {

		Area rectangle = new Area(10,15);
		rectangle.getArea();
		System.out.println(rectangle.getBreadth());
		System.out.println(rectangle.getLength());
	}

}
