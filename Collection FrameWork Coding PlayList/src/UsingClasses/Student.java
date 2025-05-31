package UsingClasses;

public class Student implements Comparable<Student>{

	private String name;
	private double gpa;
	
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}


	

	public String getName() {
		return name;
	}


	public double getGpa() {
		return gpa;
	}

	

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}




	// in comaparable we use the method within the class to define the logic for the ordering.
	@Override
	public int compareTo(Student o) {
		// gpa is double isliye hum double me compare method hai usko use le lenge.
		return Double.compare(o.getGpa(), this.getGpa());
	}
	
}
