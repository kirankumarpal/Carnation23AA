package com.array;

import java.util.TreeSet;

public class Secondlast_number_using_set {
	public static void main(String[] args) {
		int[] x = { 23, 11, 45, 12, 19, 45, 12, 45 };

		TreeSet<Integer> t = new TreeSet<Integer>();

		for (Integer i : x) {
			t.add(i);
		}

		System.out.println(t);
		System.out.println(t.last());
		System.out.println(t.lower(t.last()));
	}
}
