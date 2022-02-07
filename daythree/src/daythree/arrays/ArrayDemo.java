/**
 * 
 */
package daythree.arrays;

/**
 * @author UD SYSTEMS
 *
 */
public class ArrayDemo {

	/**
	 * @param args
	 * 
	 * Array is a collection of similar type of elements that have contiguous memory location
	 * Array is java is index based, first element of the array is stored at 0 index
	 * 
	 */
	public static void main(String[] args) {
		
		int arr[] ; //declared 'arr' variable
		arr= new int[10]; // initialized 'arr' variable with 10 spaces or memory location
		arr[0]=5; //Assignment operator '=' you are assigning value to the particular index position in an array
		arr[4]=6;
		arr[3]=1;
		//To print or display on stdout console
		System.out.println(arr[5]);
		System.out.println(arr[1]);
		System.out.println(arr[4]);
		System.out.println("************************************");
		int arrayOfNumbers[] = {1,2,3,4,5,6};//Intialized and declared the arrayOfNumbers variable in a same line
		System.out.println(arrayOfNumbers.length);
		System.out.println(arrayOfNumbers[3]);
	}

}
