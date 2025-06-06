package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// if return is +ve than o1 will come after o2 and if it is -ve than o1 will come first for zero(0) but are equal in priority of ordering.
		return o1.length() - o2.length();
	}
	
}

public class ArrList {

	public static void main(String[] args) {

 
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list.getClass().getName()); //gives the name of the clss
		// we can write this also 
		// List<Integer> arrlist = new ArrayList<>();
		
		list.add(1); // index 0
		list.add(3);
		list.add(5);
		list.add(11);
		System.out.println(list.get(2));
		System.out.println(list.size()); // gives number of elements in arraylist
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
	
		
		List<String> list2 = Arrays.asList("Monday","Tuesday");
		//list2.add("Wednesday"); (throw exception bcz it is fixed size)
		
		list2.set(1, "Wednesday"); // but we can replace and can also remove 
		System.out.println(list2);
		System.out.println(list2.getClass().getName());
		
		// But if we convert this array into arraylist than expception will not throw 
		List<String> list5 = new ArrayList<>(list2);
		list5.add("Friday");
		System.out.println(list5);
		
		String[] array = {"Apple","Banana","Cherry"};
		List<String> list3 = Arrays.asList(array);
		System.out.println(list3.getClass().getName());
		
		List<Integer> list4 = List.of(1,2,55,11); //Returns an unmodifiable list containing four elements (Elements cannot be added, removed, or replaced)
		
		list.addAll(list4); // we can add list or array also 
		System.out.println(list);
		
		Collections.sort(list); // no return type 
		// we can also use (using comparator interface(used for custom ordering )  ) 
		// list.sort(null);
		
		System.out.println(list);
		
		
		//if we want to sort string than also we can use comparator interface 
		List<String> wordList = Arrays.asList("ram", "shyaam","arjun");
		// wordList.sort(null); // this will print acc to alphabte order like a than b and soo on (here it will print -> arjun, ram, shyam)
		
		wordList.sort(new StringLengthComparator());
		System.out.println(wordList);
	}

}
