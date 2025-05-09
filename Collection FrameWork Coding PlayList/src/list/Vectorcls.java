package list;

import java.util.LinkedList;
import java.util.Vector;

public class Vectorcls {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>(5,3); // we have passed intial capacity as 5 and if it reches than increment by 3
		vector.add(1);
		vector.add(2);
		System.out.println(vector.capacity()); // in vector we can get the capacity of vector unlike array list 
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(3);
		list.add(11);
		
		Vector<Integer> vector2 = new Vector<>(list); // we can also pass the collection in the costructor
		System.out.println(vector2);
		
	}

}
