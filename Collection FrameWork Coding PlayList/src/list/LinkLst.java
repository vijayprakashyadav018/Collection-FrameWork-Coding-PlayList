package list;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkLst {

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		linkedList.add(7);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(11);
		linkedList.get(2); // time complaxity O(n)
		linkedList.addLast(6);
		linkedList.addFirst(0);
		linkedList.getFirst();
		linkedList.getLast();
		
		System.out.println(linkedList);
		linkedList.remove(0); // remove bhut method hai 
		
		// we can also remove using lambda expression
		linkedList.removeIf(x -> x % 2 == 0); // this means even numbers are removed 
		System.out.println(linkedList);
		
		
		LinkedList<String> animals = new LinkedList<>(Arrays.asList("cat","dog","lion"));
		LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("dog","elephant"));
		
		animals.removeAll(animalsToRemove); // this will remove the animals which are comman to animalsToRemove Linkedlist collection 
		System.out.println(animals);
		
	}

}
