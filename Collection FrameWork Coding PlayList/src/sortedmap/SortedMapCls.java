package sortedmap;

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
	}

}
