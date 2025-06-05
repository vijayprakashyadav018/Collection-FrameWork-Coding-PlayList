package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetInterfaceExplaination {

	public static void main(String[] args) {
		
		// Set is a collection that cannot contain duplicate elements.
		// Faster Operations 
		// Map --> HashMap, LinkedHashMap, TreeMap, EnumMap
		// Set --> HashSet(output : no order), LinkedHashSet(output : order as put element), TreeSet(output : sorted), EnumSet
		Set<Integer> set = new HashSet<>();
		set.add(12);
		set.add(1);
		set.add(1);
		set.add(67);
		System.out.println(set);
		
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(12);
		set1.add(1);
		set1.add(1);
		set1.add(67);
		System.out.println(set1);
		
		Set<Integer> set2 = new TreeSet<>();
		set2.add(12);
		set2.add(1);
		set2.add(1);
		set2.add(67);
		System.out.println(set2);
		
		NavigableSet<Integer> set4 = new TreeSet<>();
		// now more methods are accessible just like navigable map.
		set4.add(12);
		set4.add(1);
		set4.add(1);
		set4.add(67);
		System.out.println(set4);
		
		
		// Now for thread safety --:
		
		// this will make the particular set as synchronized set (thread safe).
		// But its performance is very low and complexity is also high.
		Set<Integer> integers = Collections.synchronizedSet(set); // this will put the set into the synchronized block.
		
		// For better performance and also give output in sorted mannner we use ConcurrentSkipListSet.
		Set<Integer> set5 = new ConcurrentSkipListSet<>();
		
		// for unmodifiable
		
		Set<Integer> set6 = Set.of(1,2,3,4,5,6,7,8,9,54,11); // here we can put more than 10 entries unlike map.
		Collections.unmodifiableSet(null); // can pass the set which we want not to modify.
		

	}

}
