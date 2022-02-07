package daythree.arrays;

public class Demo {

	int intNumbers[]; // Declared an array

	// Contructor
	Demo(int i) {
		intNumbers = new int[i]; //initializing arrays
	}

	void populateArray() {

		for (int i = 0; i < intNumbers.length; i++) {
			intNumbers[i] = i;
		}
	}

	void displayContents() {
		for (int i = 0; i < intNumbers.length; ++i) {
			System.out.println("Number " + i + " : " + intNumbers[i]);
		}
	}

	public static void main(Integer[] args) {
		// Accepting array length as command line argument
				
				Demo arrayExample = new Demo(args[0]);
				System.out.println("*****************************************");
				arrayExample.displayContents();

				arrayExample.populateArray();
				System.out.println("#############################################");
				arrayExample.displayContents();

	}
	
	//This main method is required to identify Java main class Demo
	public static void main(String[] args) {
		// Accepting array length as command line argument
				Integer intArg = Integer.parseInt(args[0]);
				Integer[] newArr = new Integer[1];
				newArr[0]=intArg;
				main(newArr);
				
				Box boxArr[]=new Box[3];
				boxArr[0]= new Box();
				boxArr[1]= new Box();
				boxArr[2]= new Box();
				
				System.out.println(boxArr);
				for(Box box:boxArr) {
					System.out.println(box);
				}
	}
}
