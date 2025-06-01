package map_;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapCls {

	public static void main(String[] args) {
		
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
		// Java 7 --> segment based locking --> 16 segments --> smaller hashmaps
		// Only the segment being written to or read from is locked
		// read: do not require locking unless there is a write operation happening on the same segment
		// write: lock
		
		// Java 8 --> no segmentation
		// In read noo locking 
		// Now for Write (we use --> Compare-And-Swap Approach) --:
		//        --> Compare-And-Swap Approach --> no locking except resizing(here during resize size not get doubled but instead it add one-one bucket as per need soo when the new bucket is genrated it may be possible two thread want to hold the bucket at same time soo to avoid it we use locking on it.) or collision
		// Thread A last saw --> x = 45
		// Thread A Work --> x to 50
		// if x is still 45, then chnage it to 50 else don't change and retry.
		// similar process is for put also.
		
		

	}

}
