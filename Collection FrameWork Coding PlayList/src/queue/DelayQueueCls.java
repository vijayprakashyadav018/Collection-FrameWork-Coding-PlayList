package queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueCls {

	public static void main(String[] args) throws InterruptedException {
		
		// thread-safe unbounded blocking queue
		// Elements can only be taken from the queue when their delay has expired.
		// Usefull for scheduling tasks to be executed after a certain delay.
		// internally priority queue is used.
		
		BlockingQueue<DelayedTask> queue = new DelayQueue<>();
		queue.put(new DelayedTask("Task1", 5, TimeUnit.SECONDS));
		queue.put(new DelayedTask("Task2", 3, TimeUnit.SECONDS));
		queue.put(new DelayedTask("Task3", 10, TimeUnit.SECONDS));
		
		
		while(!queue.isEmpty()) {
			DelayedTask task = queue.take(); // Blocks untill a task's delay has expired( given time over hone ke bad )
			System.out.println("Executed:" + task.getTaskName() + " at " + System.currentTimeMillis());
		}
		
	}

}

class DelayedTask implements Delayed{

	
	private final String taskName;
	private final long startTime;
	
	
	
	public DelayedTask(String taskName, long startTime, TimeUnit unit) {
		super();
		this.taskName = taskName;
		this.startTime = System.currentTimeMillis() + unit.toMillis(startTime);
	}

	@Override
	public int compareTo(Delayed o) {
		if (this.startTime < ((DelayedTask ) o).startTime) {
			return -1;
		}
		
		if (this.startTime > ((DelayedTask) o).startTime) {
			return 1;
		}
		
		return 0;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		long remaining  = startTime - System.currentTimeMillis();
		return unit.convert(remaining, TimeUnit.MILLISECONDS);
	}

	public String getTaskName() {
		return taskName;
	}
	
	
	
	
	
}