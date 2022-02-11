package dayseven.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import dayseven.methodreference.Order;

public class BasicStreamExample {

	public static void main(String[] args) {
		List<Integer> listOfNumbers = Arrays.asList(15,11,10,9,12,13,2,5,8,1,7,6,4,14,16);
		
		listOfNumbers.stream() //source of stream
					 .filter(num->num>3) //operation
					 .limit(5) //restricting stream processing for the first 5 elements
					 .forEach(System.out::println);
		
		System.out.println("***************************************");
		Stream<Integer> streams=listOfNumbers.stream();
		Stream<Integer> strm = streams.filter(num->num>10);
		Stream<Integer> stm= strm.limit(5);
		stm.forEach(System.out::println);
		
		
		System.out.println("***************************************");
		listOfNumbers.stream() //source of stream
					 .filter(num->num>1) //operation
					 .limit(5) //restricting stream processing for the first 5 elements
					 .forEach(System.out::println);
		
		System.out.println("***************************************");
		listOfNumbers.stream() //source of stream
					 .filter(num->num>10) //operation
					 .skip(5) //stream processing skipped for the first 5 elements
					 .forEach(System.out::println);
		
		System.out.println("*************Sort**************************");
		listOfNumbers.stream() //source of stream
					 .sorted() //operation //By default, it returns stream items in natural order
					 .forEach(System.out::println);
		
		Collections.reverse(listOfNumbers);
		System.out.println("***********************List of order streams example******************");
		Order order1 = new Order("AUD",15000);
		Order order2 = new Order("INR",5000);
		Order order3 = new Order("USD",150000);
		Order order4 = new Order("EUR",25000);
		Order order5 = new Order("AUD",8000);
		Order order6 = new Order("EUR",50000);
		
		List<Order> orderList = new ArrayList<Order>();
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		orderList.add(order4);
		orderList.add(order5);
		orderList.add(order6);
		
		orderList.stream().filter(o->o.getAmount()>5000)
						.sorted(Comparator.comparing(Order::getAmount))
						.forEach(System.out::println);
	
		System.out.println("******************Example of map() function*****************");
		List<String> words = Arrays.asList("Hello","stream","learning");
		
		words.stream().map(str->str.length()).forEach(System.out::println);
		System.out.println("******************************************");
		List<Integer> counts =words.stream().map(str->str.length()).collect(Collectors.toList());
		counts.forEach(System.out::println);
		System.out.println(counts);
		
		System.out.println("********************map() on orderList***********************");
		orderList.stream()
				 .filter(o->o.getCurrency().equals("EUR"))
				 .map(Order::getAmount)
				 .forEach(System.out::println);
		
		//Order Amount of order whose currency is EUR
		double totalAmount = orderList.stream().filter(o->o.getCurrency().equals("EUR"))
				 .map(Order::getAmount)
				 .reduce(0.0, (x,y)->x+y);
		System.out.println(totalAmount);
		
		//Other Terminal Functions --- min(), max(), count()
		System.out.println("***********************min**************************");
		System.out.println(orderList.stream()
				.filter(o->o.getCurrency().equals("EUR"))
				.min(Comparator.comparing(Order::getAmount)));
		System.out.println("***********************max**************************");
		System.out.println(orderList.stream()
				.filter(o->o.getCurrency().equals("EUR"))
				.max(Comparator.comparing(Order::getAmount)));
		System.out.println("***********************count**************************");
		System.out.println(orderList.stream()
				.filter(o->o.getCurrency().equals("EUR"))
				.count());
	}

}
