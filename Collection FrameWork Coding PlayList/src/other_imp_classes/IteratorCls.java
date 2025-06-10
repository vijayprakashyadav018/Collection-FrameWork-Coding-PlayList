package other_imp_classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorCls {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int integer : list) {
			System.out.println(integer);
		}
		
		
		// foreach loop ke inside ye work krta hai java
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Itrator also give the functionality to REMOVE while iterating  
		List<Integer> number = new ArrayList<>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		
		// THIS WILL GIVE CONCURRENTMODIFICATION EXCEPTION --
//		for (Integer integer : number) {
//			if (integer % 2 ==0) {
//				number.remove(0);
//			}
//		}
		
		
		// this will not give exception we can remove while iterate 
		Iterator<Integer> itr = number.iterator();
		while (itr.hasNext()) {
			Integer integer = itr.next();
			if (integer % 2 == 0) {
				itr.remove();
			}
		}
		
		System.out.println(number);
		
	}

}
