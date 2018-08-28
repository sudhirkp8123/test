package com.java.string;

import java.util.HashMap;
import java.util.Map;

public class EachCharCountInString {

	public static void main(String[] args) {
		String str = 1 + 2 + "teest" + 2 + 3;
		System.out.println(str);
		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}
