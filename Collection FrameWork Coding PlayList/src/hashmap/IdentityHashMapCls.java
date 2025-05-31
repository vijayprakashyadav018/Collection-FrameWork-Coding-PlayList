package hashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapCls {

	public static void main(String[] args) {
		
		String key1 = new String("key");
		String key2 = new String("key");
		
		
		//(it use the hashcode which is override from Object Class in String Class here we use the object value to calculate the hashcode)here it will replace the key1 value with the key2 value bcz it the value key(new String("key");) using equals method if same than it replace the latest value.
		// it use the equals methodto compair.
	/*	Map<String, Integer> map = new HashMap<>();
		map.put(key1, 1);
		map.put(key2, 2);
		System.out.println(key1.equals(key2));
		System.out.println(map);
	*/
		
		
		System.out.println(System.identityHashCode(key1)); // this hashcode is of identityHashMap (which use memory address of object)
		System.out.println(System.identityHashCode(key2));
		System.out.println(key1.hashCode()); // this hashcode of hashmap (which use object value)
		System.out.println(key2.hashCode());
		
		
		//(but In the IdentityHashMap we use the hashcode which is define in Object Class where we use memory address to calculate hashcode. ) but if we use identityHashMap than it give the output individually.
		// it use the (==) double equal oprator to compair.
		Map<String, Integer> map = new IdentityHashMap<>();
		map.put(key1, 1); // key, 1
		map.put(key2, 2); // key, 2
		System.out.println(key1.equals(key2)); // it compair the vlaues that's why its output is "true".
		System.out.println(map);
		
	}

}
