package set;

import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetCls {

	public static void main(String[] args) {
		
		// Thread Safe 
		// Copy OnWrite Mechanism
		// No Duplicate Elements
		// Iterators(write oprations) Do Not Reflect Modifications during read.
		// if frequent Read and Write are more than we will use concurrentSkipList.
		// if Read are more and Write are less than we will use copyOnWrite. 
		
		CopyOnWriteArraySet<Integer> copyOnWriteSet = new CopyOnWriteArraySet<>();
		ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();
		
		for(int i = 1; i<= 5; i++) {
			copyOnWriteSet.add(i);
			concurrentSkipListSet.add(i);
		}
		
		
		System.out.println("Initial CopyOnWriteArraySet: " + copyOnWriteSet);
		System.out.println("Initial ConcurrentSkipListSet: " + concurrentSkipListSet);
		
		System.out.println("\n Iterating and modifying CopyOnWriteArraySet:");
		for(Integer num : copyOnWriteSet) {
			System.out.println("Reading from CopyOnWriteArraySet: " + num);
			// Attmpting to modify the set during iteration
			copyOnWriteSet.add(6);
		}
		
		System.out.println(copyOnWriteSet); // now 6 will be shown.
		
		
		System.out.println("\n Iterating and modifying ConcurrentSkipListSet:");
		for(Integer num : concurrentSkipListSet) {
			System.out.println("Reading from ConcurrentSkipListSet: " + num);
			// Attmpting to modify the set during iteration
			concurrentSkipListSet.add(6); // here it may show 6 inside also.
		}
		

	}

}
