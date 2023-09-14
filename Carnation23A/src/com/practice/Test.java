package com.practice;

import java.util.HashMap;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");

//		Set key = map.keySet();
//		Iterator itr = key.iterator();
//		while (itr.hasNext()) {
//			System.out.println(map.get(itr.next()));
//		}

		Set key = map.entrySet();
		for (Object object : key) {
			System.out.println(object);
		}

	}

}
