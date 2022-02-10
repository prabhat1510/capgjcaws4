package daysix.list;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentNew> {

	@Override
	public int compare(StudentNew o1, StudentNew o2) {
		return o1.getStudentName().compareTo(o2.getStudentName());
		
		
	}

}
