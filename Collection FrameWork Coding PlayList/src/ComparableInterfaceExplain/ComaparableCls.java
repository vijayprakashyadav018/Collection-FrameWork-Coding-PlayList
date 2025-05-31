package ComparableInterfaceExplain;

import java.util.ArrayList;
import java.util.List;

import UsingClasses.Student;

public class ComaparableCls {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("RAHUL", 5.0));
		list.add(new Student("Bob", 3.5));
		list.add(new Student("Kavita", 4.5));
		list.add(new Student("Bittu", 7.0));

		list.sort(null);
		System.out.println(list);
	}

}
