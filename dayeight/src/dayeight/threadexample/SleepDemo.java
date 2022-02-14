package dayeight.threadexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SleepDemo {

	public static void main(String[] args) {
		List<String> seasonList = new ArrayList<String>();
		seasonList= Arrays.asList(new String[] {"Winter","Summer","Spring","Autumn"});
		
		for(String value: seasonList) {
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(value);
		}

	}

}
