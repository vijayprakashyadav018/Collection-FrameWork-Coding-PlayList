package queue;

import java.util.Comparator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;



class Producer implements Runnable{
	private BlockingQueue<Integer> queue;
	private int value = 0;
	
	
	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}


	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("Producer Produced :" + value);
				queue.put(value++);
				Thread.sleep(1000);
			} catch (Exception e) {
				Thread.currentThread().interrupt();
				System.out.println("Producer Interrupted");
			}
		}
		
	}
	
}



class Consumer implements Runnable{
	private BlockingQueue<Integer> queue;
	
	
	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}


	@Override
	public void run() {
		while(true) {
			try {
				Integer value = queue.take();
				System.out.println("Consumer Consumed :" + value);
				Thread.sleep(2000);
			} catch (Exception e) {
				Thread.currentThread().interrupt();
				System.out.println("Consumer Interrupted");
			}
		}
		
	}
	
}



public class BlockingQueueCls {

	
	        // thread safe queue
			// wait for queue to become non-empty(wait till the data fill soo that it may retrive it) and also wait for space to fill data in a queue.
			// simplify concurrancy problems like producer-consumer --> producer(producer jab tak produce nhi krega untill space available naa ho queue me ) and consumer(consumer jab tak consume nhi krega jbb tak queue me kuch aa nhi jata)
			
			// standard queue --> perform oprations(add,remove etc) immediately 
			   // empty --> remove (it will execute without wait unlike BlockingQueue)
			   // full --> add (it will execute without wait unlike BlockingQueue)
			
			// Blocking Queue :-
			  // put --> Blocks if the queue is full untill space becomes available
			  // take --> Blocks if the queue is empty untill an element becomes available
			  // offer --> Waits for space to become availablem, up to the specified timeout 
	
	public static void main(String[] args) {
		
		// BlockingDeque<E> (interface)
		
		
		// ArrayBlockingQueue -->
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
		// A bounded, blocking queue backed by an circular array
		// uses a single lock for both enqueue and dequeue operations
		// more threads --> than may cause a problem bcz than they wait each other for too long.
		
		Thread producer = new Thread(new Producer(queue));
		Thread consumer = new Thread(new Consumer(queue));
		producer.start();
		consumer.start();

		
		
		// linkedBlockingQueue -->
		BlockingQueue<Integer> queue1 = new LinkedBlockingQueue<>();
		// optionally bounded(capacity optional) but capacity dena hi recommend hai wrna ye out of memory ERROR de skta hai.
		// Backed by LinkedList
		// Uses two separate locks for enqueue and dequeue operations
		// Higher concurrancy between producer and consumers
		// Used when threads are more.
		// Methods are similar to others..
		
		
		
		// PriorityBlockingQueue -->
		BlockingQueue<Integer> queue2 = new PriorityBlockingQueue<>(11,Comparator.reverseOrder());
		// unbounded
		// Creates a PriorityBlockingQueue with the defaultinitial capacity (11) that orders its elements according to their natural ordering
		// Array ke form me  Binary Heap store hotiii hai and can grow dynamically.
		// Head is based on their natural ordering or a provided Comparator like priority queue.
		// put would not block
		
		
		
		// SynchronousQueue -->
		BlockingQueue<Integer> queue3 = new SynchronousQueue<>();
		// each insert operation must wait for a corresponding remove operation by another thread and vice versa.
		// it can not store elements, capacity of at most one element.
		
		
		
	}

}
