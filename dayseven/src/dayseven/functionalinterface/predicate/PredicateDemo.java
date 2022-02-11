package dayseven.functionalinterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateDemo {

	public static void main(String[] args) {
		List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);

		List<Integer> collect = listOfInteger.stream().filter(x->x>5).collect(Collectors.toList());
		System.out.println(collect);
		
		Stream stream = listOfInteger.stream().filter(x->x>8 && x<14);
		System.out.println(stream);
		Set<Integer> setCollected = (Set<Integer>) stream.collect(Collectors.toSet());
		System.out.println(setCollected);
	}

}
