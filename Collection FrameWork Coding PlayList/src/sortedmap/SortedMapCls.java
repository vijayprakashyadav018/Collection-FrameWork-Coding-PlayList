package sortedmap;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapCls {

	public static void main(String[] args) {
		
		
		// natural ordering 
		SortedMap<Integer, String> map = new TreeMap<>();
		map.put(91, "Vivek");
		map.put(99, "Shubam");
		map.put(78, "Mohit");
		map.put(77, "Vipul");
		System.out.println(map);
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.headMap(91)); // exclude
		System.out.println(map.tailMap(91)); // include

		// time complexities.
	    map.get(77); // log(n)
	    map.containsKey(78); // log(n)
	    map.containsValue(77); // O(n)
		
		
		// custom ordering (here we use comparator)
		SortedMap<Integer, String> map1 = new TreeMap<>((a,b) -> b-a);
		map1.put(91, "Vivek");
		map1.put(99, "Shubam");
		map1.put(78, "Mohit");
		map1.put(77, "Vipul");
		System.out.println(map1);
		
		System.out.println(map1.firstKey());
		System.out.println(map1.lastKey());
		System.out.println(map1.headMap(91)); // exclude
		System.out.println(map1.tailMap(91)); // include
		
		
		
		// NavigableMap Interface
		NavigableMap<Integer, String> navigableMap = new TreeMap<>();
		navigableMap.put(1, "One");
		navigableMap.put(5, "Five");
		navigableMap.put(3, "Three");
		navigableMap.put(7, "Seven");
		System.out.println(navigableMap);
		System.out.println(navigableMap.lowerKey(4)); //Returns the greatest key strictly less than the given key, or null if there is no such key.
		System.out.println(navigableMap.ceilingKey(4)); //Returns the least key greater than or equal to the given key,or null if there is no such key.
		System.out.println(navigableMap.higherEntry(3));
		System.out.println(navigableMap.descendingMap());
		
	}

}
