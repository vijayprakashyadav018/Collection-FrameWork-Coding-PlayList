package queue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueCls {

	private static ConcurrentLinkedQueue<String> task = new ConcurrentLinkedQueue<>();
	// here also compair and swap method used like concurrentHashMap
	
	public static void main(String[] args) {
		
		Thread producer = new Thread(() ->{
			while(true) {
				try {
					task.add("Task " + System.currentTimeMillis()); // yha lock nhi lgega 
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		Thread consumer = new Thread(() ->{
			while(true) {
				try {
					String task1 = task.poll(); // noo lock and blocks here
					System.out.println("Processing: " + task1);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		producer.start();
		consumer.start();

	}

}
