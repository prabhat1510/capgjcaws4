package dayseven.methodreference;

import java.util.Comparator;

public class AmountCompartor implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {
		if(o1.getAmount()==o2.getAmount()) {
			return 0;
		}else if(o1.getAmount() >o2.getAmount()) {
			return 1;
		}else {
			return -1;
		}
	}

}
