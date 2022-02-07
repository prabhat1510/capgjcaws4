package daythree.controlstatements;

public class SampleForLoop {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,7};
		for(int index=0;index<arr.length;index++) {
			System.out.println(arr[index]);
		}
		
		System.out.println("******************************");
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
