package daysix.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	//TreeMap will give you a sorted output
	public static void main(String[] args) {
		HashMap<String,Double> hm = new HashMap<String,Double>();
		hm.put("John Doe", 3434.34);
		hm.put("Tom Smith", 123.22);
		hm.put("Tod Hall", 1378.00);
		hm.put("Ralph Smith", 99.22);
		hm.put(null, 18.24);
		hm.put("Rajesh", null);
		hm.put(null, 16.5);
		hm.put("Prabhat", 99.22);
		hm.put("Ralph Smith", 98.22);
		System.out.println(hm);
		Set set = hm.entrySet();// Get a set of the entries in map
		System.out.println(set);
		System.out.println(hm.keySet());
		System.out.println(hm.get("Prabhat"));
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Double> me = (Map.Entry<String, Double>)itr.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());

	}

}
