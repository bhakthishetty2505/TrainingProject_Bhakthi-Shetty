package com.tyss.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {

	public static <K> void main(String[] args) {
		
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
		
		lh.put("Bangalore", 560068);
		lh.put("Hariyana", 134203);
		lh.put("Patna", 880000);
		
		for(Map.Entry<String, Integer> m : lh.entrySet()) {
			
			String key = m.getKey();
			Integer value = m.getValue();
			
			System.out.println("Key is " +key + " And Value is " +value);
			
			//System.out.println("**************");
		}
	}
}
