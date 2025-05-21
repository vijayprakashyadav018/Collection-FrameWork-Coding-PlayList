package map.weakhashmap;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapCls {

	public static void main(String[] args) {
		WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
		
	/*	imageCache.put("img1", new Image("Image 1"));
		imageCache.put("img2", new Image("Image 2"));
		
		// here both images will be displayed bcz they still present in STRING LITRALE POOL
	*/	
		
		
		// here they will be removed by JVM (garbage collector )
//		imageCache.put(new String("img1"), new Image("Image 1"));
//		imageCache.put(new String("img2"), new Image("Image 2"));
		
		
		loadCache(imageCache);
		System.out.println(imageCache);
		//System.gc(); // it is just to explain how it will work but in real production we not write this.
		simulateApplicationRunning();
		System.out.println("Cache after running (some entries may be cleared): "+ imageCache);

	}
	
	// we can alsoo try like this
	public static void loadCache(Map<String, Image> imageCache) {
		
		String k1 =new String("img1");
		String k2 =new String("img2");
		imageCache.put(k1, new Image("Image 1"));
 		imageCache.put(k2, new Image("Image 2"));
		
	}

	private static void simulateApplicationRunning() {
		try {
			System.out.println("Simulating applicaiton running...");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

class Image{
	
	private String name;
	
	public Image(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		 return name;
	}
	
}