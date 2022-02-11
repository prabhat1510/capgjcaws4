package dayseven.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(10,20,30,40,50);
		stream.forEach(System.out::println);
		
		System.out.println("*****************************");
		Integer[] values = new Integer[] {10,20,30};
		Stream<Integer> streamInt= Arrays.stream(values);
		streamInt.forEach(System.out::println);
		
		System.out.println("*****************************");
		List<Integer> listOfInteger = new ArrayList<Integer>();
		(listOfInteger.stream()).forEach(System.out::println);
		
	}

}
