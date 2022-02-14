package dayeight.threadexample.collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<String,String> hashMap = new ConcurrentHashMap<String, String>();
		hashMap.put("A", "Pune");
		hashMap.put("B", "Mumbai");
		hashMap.put("C", "Patiala");
		hashMap.put("D", "Panjim");
		
		String result = hashMap.search(10000, (key,value)->value.startsWith("P")?value:null);
		System.out.println(result);
		
		/**
		ConcurrentHashMap<String,Integer> hMap = new ConcurrentHashMap<String, Integer>();
		hMap.put("A", 1);
		hMap.put("B", 2);
		hMap.put("C", 3);
		hMap.put("D", 4);
		
		String results = hMap.reduce(10000, (key,value)->value.size(),(value1,value2)->Integer.max(value1, value2));
		**/
	}

}
