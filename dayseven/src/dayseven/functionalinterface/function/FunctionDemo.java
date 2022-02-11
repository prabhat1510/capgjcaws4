package dayseven.functionalinterface.function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		//Here example takes <T> String and returns the length of the string as <R> Integer
		
		Function<String,Integer> func= x->x.length();
		Integer apply = func.apply("Prabhat");
		System.out.println(apply);
		
		Function<Integer,Integer> func2 = x->x*2;
		Integer result = func.andThen(func2).apply("Prabhat");
		System.out.println(result);
		
		
		FunctionDemo obj = new FunctionDemo();
		List<String> listOfStr = Arrays.asList("Nodejs","Java","JavaScript","ReactJS");
		
		//Lambda
		Map<String,Integer> map = obj.convertListToMap(listOfStr,x->x.length());
		System.out.println(map);

	}

	private <T,R> Map<T, R> convertListToMap(List<T> listOfStr, Function<T,R> func) {
		Map<T,R> result = new HashMap<>();
		for(T t:listOfStr) {
			result.put(t, func.apply(t));
		}
		
		return result;
	}

}
