package daysix.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentNewComparatorDemo {

	public static void main(String[] args) {
		List<StudentNew> studentNewList = new ArrayList<StudentNew>();
		studentNewList.add(new StudentNew(11,"Harry",95.45,21));
		studentNewList.add(new StudentNew(10,"Shally",91.45,20));
		studentNewList.add(new StudentNew(12,"George",85.45,22));
		studentNewList.add(new StudentNew(9,"Bob",51.45,19));
		
		System.out.println(studentNewList);
		System.out.println("Sorting by Name");
		Collections.sort(studentNewList,new NameComparator());
		System.out.println(studentNewList);
		
		System.out.println("Sorting by Age");
		Collections.sort(studentNewList,new AgeComparator());
		System.out.println(studentNewList);
		
		System.out.println("Sorting by Marks");
		Collections.sort(studentNewList,new MarksComparator());
		System.out.println(studentNewList);
		Collections.reverse(studentNewList);
		System.out.println("Reverse Order on the basis of Marks");
		System.out.println(studentNewList);
	}

}
