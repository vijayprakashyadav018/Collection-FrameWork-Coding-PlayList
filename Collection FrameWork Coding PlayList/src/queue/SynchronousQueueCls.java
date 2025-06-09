package queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueCls {

	public static void main(String[] args) {
		
		BlockingQueue<String> queue = new SynchronousQueue<>();
		
		
		Thread producer = new Thread(() -> {
			try {
				System.out.println("Producer is waiting to transfer...");
				queue.put("Hello from producer");
				System.out.println("Producer has transferred the message");
			} catch (InterruptedException e) {
				 Thread.currentThread().interrupt();
				 System.out.println("Producer was interrupted");
			}
		});
		
		
		Thread consumer = new Thread(() -> {
			try {
				System.out.println("consumer is waiting to receive...");
				String message = queue.take();
				System.out.println("consumer received :" + message);
			} catch (InterruptedException e) {
				 Thread.currentThread().interrupt();
				 System.out.println("consumer was interrupted");
			}
		});
		
		
		producer.start();
		consumer.start();
	}

}
