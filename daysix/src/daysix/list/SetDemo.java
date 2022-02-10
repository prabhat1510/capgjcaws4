package daysix.list;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	//Set will not store duplicate elements. 
	public static void main(String[] args) {
		//HashSet does not allow duplicates
		//is an unsorted,unordered Set
		
		Set set = new HashSet();
		set.add("Hello");
		set.add(null);
		set.add("Hello");
		set.add(15);
		set.add(15.50);
		System.out.println(set);
		
		Set<String> setOfStr = new HashSet<String>();
		setOfStr.add("Hello");
		setOfStr.add(null);
		setOfStr.add("Everyone");
		System.out.println(setOfStr);
		
		Employee e = new Employee();
		e.setEmpId(11);
		e.setEmpName("Ayush");
		
		Employee e1 = new Employee();
		e1.setEmpId(15);
		e1.setEmpName("Jyotika");
		
		Employee e2 = new Employee();
		e2.setEmpId(11);
		e2.setEmpName("Ayush");
		
		Set<Employee> setOfEmployee = new HashSet();
		setOfEmployee.add(e);
		setOfEmployee.add(e1);
		setOfEmployee.add(e2);
		
		System.out.println(setOfEmployee);
		
		//TreeSet- it does not allow duplicated
		//By default it elements will be in ascending order- Sorted Collection
		//Not Synchronized- if more than one thread wants to access it at the same time, then it must be synchronized externally
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("One");
		treeSet.add("Two");
		treeSet.add("Three");
		treeSet.add("Four");
		treeSet.add("Five");
		System.out.println(treeSet);
	}

}
