package daysix.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import daysix.list.Employee;

public class GenericsDemo {

	public static void main(String[] args) {
		//Below type T is replaced by String reference type
		Sender<String> stringSender = new Sender<String>();
		///Employee reference type
		Sender<Employee> empSender = new Sender<Employee>();
		stringSender.setMessage("String type message sent by String Sender");
		stringSender.sendMessage();
		System.out.println("***********************");
		Employee emp= new Employee();
		emp.setEmpId(11);
		emp.setEmpName("Nikhil Dubey");
		empSender.setMessage(emp);
		empSender.sendMessage();
		
		//Before Generics:
		List myIntegerList = new LinkedList();//1
		myIntegerList.add(new Integer(1));//2
		Integer intObjk = (Integer)myIntegerList.iterator().next();//3
		//After Generics
		List<Integer> listOfInteger = new LinkedList<Integer>();//1
		listOfInteger.add(1);//2
		Integer intObj = listOfInteger.iterator().next();//3
		
		//Usage of generic having multiple type parameters
		HashMap<String,Mammal> map = new HashMap<String, Mammal>();
		map.put("wombat",new Mammal("Wombat"));
		Mammal mammal = map.get("wombat");
		
		/**
		//
		Object object = new Integer(5);
		//
		Object[] objArr = new Integer[5];
		ArrayList<Object> arrayList = new ArrayList<Integer>();
		**/
		/**
		 * 
		 * There is no inheritance relationship between type arguments of a generic class is supported		 
		ArrayList<Integer> aL= new ArrayList<Integer>();
		ArrayList<Object> ao = aL;//If it is allowed at compile time,
		ao.add(new Object());
		Integer i=ao.get(0);// will result in runtime ClassCastException
		*/
		ArrayList<Integer> aL= new ArrayList<Integer>();
		List<Integer> li = new ArrayList<Integer>();
		Collection<Integer> ci = new ArrayList<Integer>();
		Collection<String> cs = new Vector<String> (4);
		
	}

}
