package daythree.arrays;

public class ArrayExample {

	int intNumbers[]; // Declared an array

	// Contructor
	ArrayExample(int i) {
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

	public static void main(String[] args) {
		
		System.out.println(args[0]+"----"+args[1]+"----------"+args[2]);
		// Accepting array length as command line argument
		int intArg = Integer.parseInt(args[0]); // Here String argument is converted into Integer using
												// Integer.parseInt()
		ArrayExample arrayExample = new ArrayExample(intArg);
		System.out.println("*****************************************");
		arrayExample.displayContents();

		arrayExample.populateArray();
		System.out.println("#############################################");
		arrayExample.displayContents();
	}

}
