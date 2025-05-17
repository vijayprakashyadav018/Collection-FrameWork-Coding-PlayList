package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqualsMethod {

	public static void main(String[] args) {
		HashMap<Student, String> map = new HashMap<>();
		
		// Object ke CASE me --> both s1 and s3 are same student but there hashcode is diff bcz object memory location is diff which is use to cal hashcode to store objects in the hashmap.
		
		Student s1 = new Student("Alice", 1);
		Student s2 = new Student("Bob", 2);
		Student s3 = new Student("Alice", 1);
		
		map.put(s1, "Boy"); // hashcode1  ---> index1
		map.put(s2, "Boy"); // hashcode2  ---> index2
		map.put(s3, "Boys Moniter"); // hashcode3  ---> index3
		
		
		System.out.println("HashMap Size:" + map.size());
		System.out.println("Value for s1:" + map.get(s1));
		System.out.println("Value for s3:" + map.get(s3));
		System.out.println(s1);
		 
	
		
		// but here there is no object --
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Shivam", 90); //hashcode1 --> index1
		map1.put("Rahul", 92); //hashcode2 --> index2
		map1.put("Shivam", 99); //hashcode1 --> index1 --> equals() --> replace (it will change the shivam marks from 90 to 99)
		
	}
	
	
	
}

class Student {
	
	private String name;
	
	private int id;
	
	
	public  Student(String name, int id) {
		this.name=name;
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(name, id);
	 
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Student other = (Student) obj;
		return id == other.getId() && Objects.equals(name, other.getName());
	}

	@Override
	public String toString() {
		return "id: "+ id +", Name:"+ name;
	}
	
	
	
	
	
	
}