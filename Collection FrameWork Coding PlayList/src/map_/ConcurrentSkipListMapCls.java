package map_;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapCls {

	public static void main(String[] args) {
		
		ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
		map.put("Apple", 2);
		// all methods are same like others.

	}

}
