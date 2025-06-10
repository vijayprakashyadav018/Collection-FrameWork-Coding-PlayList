package other_imp_classes;

import java.util.ArrayList;
import java.util.Iterator;

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

	}

}
