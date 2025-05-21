package collection;

import java.lang.ref.WeakReference;

public class GabageCollectorCls {

	public static void main(String[] args) {
		
		Phone phone = new Phone("Apple", "16 pro max"); // this is strong reference JVM will not remove it(untill we change the reference to NULL) even when not in use.
		System.out.println(phone);
		phone=null;
		//here the reference phone is now point to null and the memory used by this data ( new Phone("Apple", "16 pro max")) is clear by "JVM" that is garbage collection.  
        System.out.println(phone);
		
        
        
        // Now we will use weak reference
        WeakReference<Phone> phoneWeakReference = new WeakReference<Phone>(new Phone("Apple", "16 pro max"));
        System.out.println(phoneWeakReference.get());
        try {
			Thread.sleep(10000);
		} catch (Exception e) {
			
		}
        // here for waiting a certain time limit JVM will remove this to free the memory bcz it is WEAK REFERENCE.  
        System.out.println(phoneWeakReference.get());
        
	}

}


class Phone{
	
	String brand;
	
	String model;

	public Phone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", model=" + model + "]";
	}
	
	
	
}