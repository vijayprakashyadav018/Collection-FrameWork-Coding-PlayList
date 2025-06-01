package map_;

import java.util.Hashtable;

public class HashTableCls {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hashtable = new Hashtable<>();
		// hashtable is synchronized
		// no null key or value
		// Legacy Class (rarely used ) now replace by --> ConcurrentHashMap
		// slower than hashmap
		// hashmap is not thread sefe but hahstable is thread safe.
		// only LinkedList used even in case of collision.(binary tree not used)
		// All methods are synchronized.
		hashtable.put(1, "Apple");
		hashtable.put(2, "Banana");
		hashtable.put(3, "Cherry");
		System.out.println(hashtable);
		System.out.println("Value for key 2:" + hashtable.get(2));
		System.out.println("Does key 3 exist?" + hashtable.containsKey(3));
//		hashtable.put(null, "value"); // throws exception
//		hashtable.put(4, null); //  throws exception
		
	}

}
