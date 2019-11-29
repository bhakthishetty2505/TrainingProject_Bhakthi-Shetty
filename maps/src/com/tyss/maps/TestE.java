package com.tyss.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {

	public static void main(String[] args) {


		TreeMap<String, Integer> th = new TreeMap<>();

		th.put("Bangalore", 560068);
		th.put("Hariyana", 134203);
		th.put("Patna", 880000);
		//th.put(null, 8754121); throws NullPointerException

		for(Map.Entry<String, Integer> m : th.entrySet()) {

			String key = m.getKey();
			Integer value = m.getValue();

			System.out.println("Key is " +key + " And Value is " +value);
		}
	}
}
