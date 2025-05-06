package list;

import java.util.ArrayList;
import java.util.List;

public class ArrList {

	public static void main(String[] args) {

 
		ArrayList<Integer> list = new ArrayList<>();
		// we can write this also 
		// List<Integer> arrlist = new ArrayList<>();
		
		list.add(1); // index 0
		list.add(3);
		list.add(5);
		list.add(11);
		System.out.println(list.get(2));
		System.out.println(list.size());
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(2);
		list.add(2,7);
		list.set(0, 50); //it will replace 1 with 50
		
		for(int x: list) {
			System.out.println("using foreach loop :"+x);
		}
		
		System.out.println(list.contains(11));
		System.out.println(list.contains(5));
		System.out.println(list.contains(88));
		System.out.println(list);
	
	}

}
