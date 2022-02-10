package daysix.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String, Double> balance = new Hashtable<String, Double>();
		Enumeration names;
		String str;
		double bal;
		balance.put("Arun", 3434.34);
		balance.put("Radha", 123.22);
		balance.put("Ram", 99.22);
		
		//Show all the balances in hash table
		names= balance.keys();
		while(names.hasMoreElements()) {
			str= (String)names.nextElement();
			System.out.println(str +":"+ balance.get(str));
		}
		
		//Deposit 1000 into Ram's account
		bal = balance.get("Ram");
		balance.put("Ram", bal+1000);
		System.out.println("Ram's new balance: "+ balance.get("Ram"));
	}

}
