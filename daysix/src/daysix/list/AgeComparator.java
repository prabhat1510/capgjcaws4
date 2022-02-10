package daysix.list;

import java.util.Comparator;

public class AgeComparator implements Comparator<StudentNew> {

	@Override
	public int compare(StudentNew o1, StudentNew o2) {
		if(o1.getAge()==o2.getAge()) {
			return 0;
		}else if(o1.getAge() >o2.getAge()) {
			return 1;
		}else {
			return -1;
		}
		
	}

}
