package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeueCls {

	public static void main(String[] args) {
		
		// Double-Ended Queue
		// Allows Insertion and removal of element from both ends
		// Versatile than regular queues and stacks because they support all the operations of both
		
		/*
		 *  INSERTION METHODS 
		 *  
		 * addFirst(E e): Inserts the specified element at the front.
		 * addLast(E e): Insert the specified element at the end.
		 * offerFirst(E e): Insert the specified element at the front if possible.
		 * offerLast(E e): Insert the specfied element at the end if possible. 
		 * 
		 */

		
		
		/*
		 *  REMOVAL METHODS
		 *  
		 *  removeFirst(): Retrieves and removes the first element.
		 *  removeLast(): Retrieves and removes the last element.
		 *  pollFirst(): Retrieves and removes the first element, or returns null if empty.
		 *  pollLast(): Retrieves and removes the last element, or returns null if empty.
		 * 
		 */
		
		
		
		/*
		 *   EXAMINATION METHODS
		 *   
		 *   getFirst(): Retrieves, but does not remove, the first element.
		 *   getLast(): Retrieves, but does not remove, the last element.
		 *   peekFirst(): Retrieves, but does not remove, the first element, or returns null if empty.
		 *   peekLast(): Retrieves, but does not remove, the last element, or returns null if empty.
		 * 
		 */
		
		
		/*
		 *  STACK METHODS
		 *  
		 *  push(E e): Adds an element at the front (equivalent to addFirst(E e)).
		 *  pop(): Removes and returns the first element (equivalent to removeFirst()).
		 * 
		 */
		
		
		
		
		
		// In ArrayDeque --> Faster iteration, Low memory, No Null Allowed
		// This is good to use !!
		Deque<Integer> deque1 = new ArrayDeque<>(); // ArrayDeque --> This class is likely to be faster than {Stack} when used as a stack, and faster than {LinkedList} --> when used as a queue.
		// Circular --> head and tail
		// no need to shift elements, just shift head and tail
		deque1.addFirst(10);
		deque1.addLast(20);
		deque1.offerFirst(5);
		deque1.offerLast(25);
		// 5, 10, 20, 25
		System.out.println(deque1.getFirst()); // output: 5
		System.out.println(deque1.getLast());  // output: 25
		deque1.removeFirst(); // Removes 5
		deque1.pollLast();    // Removes 25
		System.out.println(deque1);
		
		
		
		// LinkedList as Deque --> we use this when we need insertion, deletion somewhere in middle.0
		Deque<Integer> deque2 = new LinkedList<>();
		
		
	}

}
