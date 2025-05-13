package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapCls {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(31, "Ankit");
		map.put(11, "Vijay");
		map.put(1, "Rahul");
		System.out.println(map);
		
		String student = map.get(11);
		System.out.println(student);
		
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("Rahul"));
		
		
		Set<Integer> keys = map.keySet(); //Returns a Set view of the keys contained in this map
		for(int i : keys) {
			System.out.println(map.get(i)); //order kuch bhi aa skta hai
		}
		
		
		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		for(Entry<Integer, String> i : entries) {  // here i type is "Entry<Integer, String>"
			
			System.out.println(i.getKey() +": "+ i.getValue());
			i.setValue(i.getValue().toUpperCase());
			
		}
		System.out.println(map);
	}

}
