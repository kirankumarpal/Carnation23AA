package com.collection;

import java.util.TreeSet;

public class Second_largest_numer {
	public static void main(String[] args) {
		int[] x = { 5, 8, 9, 0, 89, 68 };
		TreeSet s = new TreeSet();
		for (int i = 0; i < x.length; i++) {
			s.add(x[i]);
		}
		System.out.println(s.lower(s.last()));
	}
}
