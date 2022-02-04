package corejavaexample.main.arrays;

public class ArraysExample {

	public static void main(String[] args) {
		int num = 15;
		System.out.println(num);
		
		//Array is a collection of similar type of elements that have contiguous memory location
		//int arr[] = null;
		int arr[];
		arr= new int[10]; // initialized an array of integer which will contain 10 elements
		
		int arrA[]= {5,6,3,2,1,4,8,9,0,7};
		System.out.println(arrA);
		System.out.println(arrA[0]);
		System.out.println(arrA[4]);
		
		double arrD[] = {5.5,6.1,1.1,0.5};
		System.out.println(arrD[2]);
		
		arr[0]=11;
		arr[1]=15;
		arr[2]=10;
		arr[3]=12;
		
		System.out.println(arr.length);
		System.out.println(arrD.length);
		String strOfWords[] = {"Hello","Good","Evening","Thank You"};
		System.out.println(strOfWords.length);
		System.out.println(strOfWords.length);
		System.out.println(strOfWords[2]);
		
		System.out.println("******************************");
		for(int i=0;i<strOfWords.length;i++) {
			System.out.println(strOfWords[i]);
		}
		System.out.println("***************for each***************");
		//for each word in strOfWords do executed the statement inside the curly braces
		for(String word:strOfWords) {
			System.out.println(word);
		}
	}

}
