package daythree.controlstatements;

public class SampleContinue {

	public static void main(String[] args) {
		
		String[] listONames= {"Ravi","Soma","null","Colin","Harry","null","Smith"};
		for(int i=0;i<listONames.length;i++) {
			if(listONames[i].equals("null"))
			continue;
			System.out.println(listONames[i]);
		}
	}

}
