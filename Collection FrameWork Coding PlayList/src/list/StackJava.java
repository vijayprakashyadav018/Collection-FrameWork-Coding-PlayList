package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackJava {
  
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(7);
		stack.push(9);
		stack.push(5);
		stack.push(11);
		stack.push(18);
		System.out.println(stack);
		Integer removedElement =stack.pop(); // last wala element nikalne ke liye 
		System.out.println(removedElement);
		Integer peek = stack.peek();
		System.out.println(peek); // it will see the top most element but not remove it unlike pop() method
		System.out.println(stack);
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		
		int search = stack.search(11); // it will returns the distance(as index) of element from top of the Stack. 
		System.out.println(search);
		
		
		
		// we can use LInkedList as Stack also (we can use LinkedList in single threaded environment too avoid overhead)
		
		// LinkedList as Stack :-
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.addLast(1);
		linkedList.addLast(2);
		linkedList.getLast(); // act just like peek() method of stack
		linkedList.removeLast();// act just like pop() method of stack
		linkedList.size();
		linkedList.isEmpty();
		
		// ArrayList as Stack  (but it is not recommended bcz we do not have direct method here )
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(2);
		arrayList.get(arrayList.size() - 1); // peek
		arrayList.remove(arrayList.size() - 1); // pop
		
	}
	
}
