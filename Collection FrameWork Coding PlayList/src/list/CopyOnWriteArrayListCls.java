package list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListCls {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		
		// "Copy On Write " means that whenever a write operation -:
		// like adding and removing an elemnt occure
		// soo instead of directly modifying the existing list 
		// a new copy of the list is created, and the modification is applied to that copy 
		// This ensures that other threads reading the list while it's being modified are unaffected.
		
		// Read Operations : Fast and direct , since they happen on a stable list without interference from modifications.
		// Write Operations : A new copy of the list is created for every modification.
		//                    The reference to the list is then updated so that subsequent reads use this new list.
		
		// THIS IS USED WHEN READS ARE MORE AND WRITES ARE LESS.
		
		
		//List<String> shoppingList = new ArrayList<>(); // throws this exception "	Exception in thread "main" java.util.ConcurrentModificationException"
		
		
		
		// to overcome this problem CopyOnWriteArrayList class is made :-
		List<String> shoppingList = new CopyOnWriteArrayList<>();
		shoppingList.add("Milk");
		shoppingList.add("Breads");
		shoppingList.add("Namkeen");
		System.out.println("Initial Shopping List :" + shoppingList);
		
		
		for(String item : shoppingList) {
			System.out.println(item);
			// try to modify the list while reading 
			if (item.equals("Breads")) {
				shoppingList.add("Butter");
				System.out.println("Added Butter while reading.");
			}
		}
		
		System.out.println("Updated shopping List :" + shoppingList);
		
		
		
		
		
		// Here also exception will throw but if we use CopyOnWriteArrayList class than there is noo exception.
		//List<String> sharedList = new ArrayList<>();
		List<String> sharedList = new CopyOnWriteArrayList<>();
		sharedList.add("Apple");
		sharedList.add("Orange");
		sharedList.add("Melon");
		
		Thread readerThread = new Thread(() -> {
			try {
				while(true) {
					// Iterate through the list
					for(String item : sharedList) {
						System.out.println("Reading item :" + item);
						Thread.sleep(100); // small delay to simulate work
					}
				}
				
			} catch (Exception e) {
				System.out.println("Exception in reader thread:" + e);
			}
		});
		 
		Thread writerThread = new Thread(() -> {
			try {
				Thread.sleep(500); // Delay to allow reading to start first
				sharedList.add("Banana");
				System.out.println("Added Banana to the list.");
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		});

		
		readerThread.start();
		writerThread.start();
		
	}

}
