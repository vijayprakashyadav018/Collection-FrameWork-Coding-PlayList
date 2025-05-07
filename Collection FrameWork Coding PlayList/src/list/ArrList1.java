package list;

import java.util.ArrayList;
import java.util.List;

public class ArrList1 {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Alice", 3.0));
		students.add(new Student("bob", 3.7));
		students.add(new Student("charlie", 3.5));
		students.add(new Student("akash", 3.5));
		
		// here we are sorting using Comparator interface and Lambda expression
		// let a=akash , b= bob (than if we have -ve value than 'a' will come first or if +ve value thn 'b' will be first)
		students.sort((a,b) -> {
			if(a.getGpa() - b.getGpa() > 0) {
				return 1;
			}else if(a.getGpa() - b.getGpa() < 0) {
				return -1;
			}else {
				return 0;
			}
		});
		
		for(Student s : students) {
			System.out.println(s.getName() +": "+ s.getGpa() );
		}
	}
	
}

class Student {
	
	private String name;
	
	private double gpa;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}
	
	public String getName() {return name;}
	
	public double getGpa() {return gpa;}
}