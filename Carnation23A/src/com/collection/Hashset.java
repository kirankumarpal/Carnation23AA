package com.collection;

import java.util.LinkedHashSet;

public class Hashset {
	public static void main(String[] args) {
		System.out.println("Hashset");

		LinkedHashSet hs = new LinkedHashSet();
		hs.add(1);
		hs.add(5);
		hs.add(9);
		hs.add(25);
		hs.add(48);
		hs.add(62);

		System.out.println(hs);
	}
}
