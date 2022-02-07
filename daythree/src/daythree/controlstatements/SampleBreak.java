package daythree.controlstatements;

public class SampleBreak {

	public static void main(String[] args) {
		
		int i=0;
		for(i=9999;i<=99999;i++) {
			if(i%397 ==0)
			break;
		}
		System.out.println("First number " + "divisible by 397 between "+"9999 and 99999 is = "+i);
	}

}
