package queue;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeCls {

	public static void main(String[] args) {
		
		// non-blocking, thread-safe double-ended queue
		// SAME  method used compair and swap like concurrentHashMap
		
		ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
		// Methods same jessi hi hai.
		deque.add("Element1");
		deque.addFirst("Element0");
		deque.addLast("Element2");
		System.out.println(deque);
		
	}

}
