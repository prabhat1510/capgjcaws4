package daysix.list;

import java.util.Comparator;

public class MarksComparator implements Comparator<StudentNew> {

	@Override
	public int compare(StudentNew o1, StudentNew o2) {
		if(o1.getMarks()==o2.getMarks()) {
			return 0;
		}else if(o1.getMarks() >o2.getMarks()) {
			return 1;
		}else {
			return -1;
		}
		
	}

}
