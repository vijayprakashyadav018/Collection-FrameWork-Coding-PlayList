package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class LinkedListAsQueue {

	public static void main(String[] args) {
		
		// LinkedList as a Queue
		LinkedList<Integer> list = new LinkedList<>();
		list.addLast(1); // enqueue
		list.addLast(2);
		list.addLast(3);
		System.out.println(list);
		Integer  i = list.removeFirst(); // dequeue
		System.out.println(list);
		list.getFirst(); // peek
		
		// Normal LinkedList make it complex soo to ease it Queue is made.
		// LinkedList also implement Queue.
		/* public class LinkedList<E>
	    extends AbstractSequentialList<E>
	    implements List<E>, Deque<E>, Cloneable, java.io.Serializable
		*/
		
		Queue<Integer> queue1 = new LinkedList<>();
		// Here LinkedList methods will follow the FIFO princple as Queue 
		queue1.add(1); // work same as addLast() of Linked List 
		queue1.add(2);
		queue1.add(3);
		System.out.println(queue1);
		Integer  i1 = queue1.remove(); // dequeue
		System.out.println(queue1);
		
		
		// Difference BTW Remove and Poll, Peek and Element
		Queue<Integer> list2 = new LinkedList<>();
		System.out.println(list2.size());
	//	System.out.println(list2.remove()); // this will throw exception (NoSuchElementException)
		System.out.println(list2.poll());
		
	//	System.out.println(list2.element()); // this will throws exception
		System.out.println(list2.peek());
		
		
		Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
		System.out.println(queue2.add(1)); // true
		System.out.println(queue2.offer(2)); // true
		
		// System.out.println(queue2.add(3)); // this will throws the exception.
		System.out.println(queue2.offer(3)); // false (this will not add the element but also not  throw exception )
		
		
	}
	
}
