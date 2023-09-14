package com.collection;

import java.util.Hashtable;

public class Hashtable_occurance {
	public static void main(String[] args) {
		String s = "hello testing shastra";
		s = s.replaceAll(" ", "");

		Hashtable<Character, Integer> ht = new Hashtable<>();
		for (int i = 0; i < s.length(); i++) {
			if (ht.containsKey(s.charAt(i))) {
				int occ = ht.get(s.charAt(i));
				occ++;
				ht.put(s.charAt(i), occ);
			} else {
				ht.put(s.charAt(i), 1);
			}
		}
		System.out.println(ht);
	}
}
 