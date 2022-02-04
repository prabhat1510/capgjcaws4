package corejavaexample.main.methodoverloading;

public class BoxMain {

	public static void main(String[] args) {
		Box boxObj1 = new Box();//calls constructor 1
		Box boxObj2 = new Box(30.50); //calls constructor 2
		boxObj1.calculateVolume(15.0);
		boxObj1.calculateVolume(15);
		boxObj1.calculateVolume(1, 1.0, 5);
		boxObj1.calculateVolume(1, 1, 1);
		boxObj2.calculateVolume(2.0);
	}

}
