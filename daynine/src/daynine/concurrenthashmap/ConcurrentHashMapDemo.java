package daynine.concurrenthashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class ConcurrentHashMapDemo {
	
	/**
	 * ConcurrentHashMap implements ConcurrentMap extends Map interface
	 * ConcurrentHashMap provides a thread-safe map
	 */
	public static void main(String[] args) {
			ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<String, Integer>();
			//ConcurrentHashMap referred by num with a capacity of 8 and load factor 0.6
			//num can store 8 entries
			/**loadfactor of this map num is 0.6 - means whenever our hash table is filled by 60%,
			*  the entries are moved to a new hash table of double the size of the original hash table 
			* Default capacity of the map will be 16 and the load factor will be 0.75
			*/
			ConcurrentHashMap<String, Integer> num = new ConcurrentHashMap<String, Integer>(8,0.6f);
			
			HashMap<String,Integer> evenNumbers = new HashMap<String, Integer>();
			evenNumbers.put("Two", 2);
			evenNumbers.put("Four", 4);
			System.out.println("HashMap :   "+ evenNumbers);
			
			//Create a ConcurrentHashMap from other map or hashmap
			ConcurrentHashMap<String, Integer> nums = new ConcurrentHashMap<String, Integer>(evenNumbers);
			nums.put("Three", 3);
			System.out.println("ConcurrentHashMap:--"+nums);
			
			//Using putIfAbsent()
			nums.putIfAbsent("Six", 6);
			nums.putIfAbsent("Four", 4);
			System.out.println("ConcurrentHashMap:--"+nums);
			
			//Using putAll
			ConcurrentHashMap< String, Integer> numHashMap = new ConcurrentHashMap<String, Integer>();
			numHashMap.put("One", 1);
			
			numHashMap.putAll(nums);
			System.out.println("Concurrent Hash Map of all numbers --"+numHashMap);
			
			//entrySet() ,keySet(), values()
			System.out.println("Values --"+numHashMap.values());
			System.out.println("Values type--"+((numHashMap.values()) instanceof Collection));
			//Use of entrySet
			System.out.println("entry set --"+(numHashMap.entrySet() instanceof Set));
			//Use of keySet
			System.out.println("key set --"+numHashMap.keySet());
			/**
			Set set = numHashMap.entrySet();
			Map<String,Integer> map =new HashMap<String,Integer>();
			map.put("Six",6);
			set.add(map);
			System.out.println(set);
			**/
			
			Set keySet = numHashMap.keySet();
			keySet.forEach(System.out::println);
			//The set supports element removal which removes the corresponding mapping from the map \
			//via the Iterator.remove,Set.remove,removeAll,retainAll and clear operations. 
			//It does not support the add or addAll operations.
			//keySet.add("Seven");
			System.out.println("***********************************************************");
			Set<String> setOfKeys = numHashMap.keySet().stream().collect(Collectors.toSet());
			setOfKeys.add("Seven");
			System.out.println(setOfKeys);
			//Here we have used 4 as parallel threshold which means if the map contains 
			//4 entries the operation will be executed in parallel
			numHashMap.forEach(4,(k,v)->System.out.println("key :---"+k+ " value: "+v));
			
			//Using search()
			String key = numHashMap.search(4, (k,v)->{return v==3?k:null;});
			System.out.println("Searched value: "+key);
			
	}
}
