package map_;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapCls {

	public static void main(String[] args) {
		
		// it create array of size same as enum
		// no hashing (hashcode)
		// ordinal/index is used
		// [_,"GYM",_,_,_,_,_]
		// Faster then HashMap
		Map<Day, String> map = new EnumMap<>(Day.class);
		map.put(Day.TUESDAY, "GYM");
		map.put(Day.MONDAY, "WALK");
		String s = map.get(Day.TUESDAY);
		System.out.println(s);
		System.out.println(map);
		
	}

	
	enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	
}
