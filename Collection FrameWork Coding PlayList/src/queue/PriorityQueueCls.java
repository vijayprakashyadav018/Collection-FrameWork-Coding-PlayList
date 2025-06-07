package queue;

import java.util.PriorityQueue;

public class PriorityQueueCls {

	public static void main(String[] args) {
		
		// part of the Queue Interface
		// orders element based on their natural ordering (for primitive lowest first)
		// custom comparator for customised ordering 
		// Does not allow null elements
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(); // yha hum custom ordering de skte h brackets me.
		pq.add(15);
		pq.add(10);
		pq.add(30);
		pq.add(5);
		System.out.println(pq); // natural ordering
		System.out.println(pq.remove()); // 5 has more priority bcz of natural ordering than 10 and soo on..
		System.out.println(pq.peek());

		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		
		// Internal Working 
		// PriorityQueue is implemented as a min-heap by default(for natural ordering).
		// min-heap --> its like binary tree but here root node is smallest than child nodes are higher or equal as follows... 
		
	}

}
