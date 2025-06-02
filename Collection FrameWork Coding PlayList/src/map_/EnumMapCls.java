package map_;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapCls {

	public static void main(String[] args) {
		
		Map<Day, String> map = new EnumMap<>(Day.class);
		map.put(Day.TUESDAY, "GYM");
		map.put(Day.MONDAY, "WALK");
		System.out.println(map);
		
	}

	
	enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	
}
