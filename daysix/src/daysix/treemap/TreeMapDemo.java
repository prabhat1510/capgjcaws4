package daysix.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	//TreeMap will give you a sorted output
		public static void main(String[] args) {
			TreeMap<String,Double> tm = new TreeMap<String,Double>();
			tm.put("John Doe", 3434.34);
			tm.put("Tom Smith", 123.22);
			tm.put("Tod Hall", 1378.00);
			tm.put("Ralph Smith", 99.22);
			//tm.put(null, 18.24);
			tm.put("Rajesh", null);
			//tm.put(null, 16.5);
			tm.put("Prabhat", 99.22);
			tm.put("Ralph Smith", 98.22);
			System.out.println(tm);
			Set set = tm.entrySet();// Get a set of the entries in map
			System.out.println(set);
			System.out.println(tm.keySet());
			System.out.println(tm.get("Prabhat"));
			
			Iterator itr = set.iterator();
			while(itr.hasNext()) {
				Map.Entry<String, Double> me = (Map.Entry<String, Double>)itr.next();
				System.out.println(me.getKey()+":"+me.getValue());
			}
			
			System.out.println(tm.keySet());
			System.out.println(tm.values());

		}


}
