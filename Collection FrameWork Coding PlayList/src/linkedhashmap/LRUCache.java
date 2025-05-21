package linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LRUCache<K,V> extends LinkedHashMap<K, V> {

	
	private int capacity;
	
	public LRUCache(int capacity) {
		super(capacity, 0.75f, true);
		this.capacity = capacity;
		
	}
	
	
	// here it will remove the least recently used(LRU) data if the capacity is exceed.
	@Override
	protected boolean removeEldestEntry(Entry<K, V> eldest) {
		
		return size() > capacity;
	}



	public static void main(String[] args) {
		
		LRUCache<String , Integer> studentMap = new LRUCache<>(3);
		studentMap.put("Bob", 99);
		studentMap.put("Alice", 89);
		studentMap.put("Ram", 91);
		
		studentMap.get("Bob"); // due to this Alice will be removed bcz we just access(used) the Bob that means now Alice is least access data.
		
		studentMap.put("Vipul", 89);
		System.out.println(studentMap);
	

	}

}
