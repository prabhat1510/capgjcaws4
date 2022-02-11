package dayseven.methodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
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
		
		System.out.println(orderList);
		//Sort orderList on the basis of order amount
		Collections.sort(orderList,new AmountCompartor());
		System.out.println(orderList);
		
		System.out.println("**********************************************************");
		//getAmount method reference of Order is passed to Comparator comparing method
		Collections.sort(orderList,Comparator.comparing(Order::getAmount));
		orderList.forEach(System.out::println);
		System.out.println("******************************Sorting on the basis of Currency****************************");
		Collections.sort(orderList,Comparator.comparing(Order::getCurrency));
		orderList.forEach(System.out::println);
		
		//Static method reference example
		DisplayInformation displ = Order::displayCurrency;
		displ.display();
		
		//Reference to instance method
		DisplayInformation displayInfo = order1::displayAmount;
		displayInfo.display();
		
		
	}
	

}
