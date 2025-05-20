package linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapCls {

	public static void main(String[] args) {
		
		// we use it when the order is metor (it double linked list thats why it use memory more as conmpair to hashmap  )
		
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11,0.3f,true); // here we can pass initialcapacity , loadfactor, accessOrder (accessOrder --> in this we can pass true or false by dafault it is false but if we pass true than the key which we access will goo to the last of the linkedHashMap.)
		linkedHashMap.put("Orange", 19);
		linkedHashMap.put("Apple", 20);
		linkedHashMap.put("Guava", 13);
		
		//here we try to access Apple first than Orange 
		// we can remove the list recent used data (by this we can find which data is access less ).
		linkedHashMap.get("Apple");
		linkedHashMap.get("Orange");
		
		// in LinkedHashMap oderded is maintained but it in HashMap it is not.
		for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
			 System.out.println(entry.getKey() +": "+ entry.getValue());
		}
		
		
		// some methods that are missed in hashmap :-
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("Shubam", 91);
		hashMap.put("Bob", 88);
		hashMap.put("Akshit", 78);
		
		Integer res = hashMap.getOrDefault("Vipul", 0); // return the value if key is present if not than return default.
		hashMap.putIfAbsent("Rohit", 92); // put rohit if not in the hashmap or if present than no change.
		System.out.println(hashMap);
		
		
		
	}
	
	
}
