package com.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Sort_in_Hashset {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(85);
		hs.add(5);
		hs.add(48);
		hs.add(-9);
		hs.add(0);
		
		// Ascending order
		LinkedList list = new LinkedList(hs);
		Collections.sort(list);
		System.out.println("List: " + list);

		// Ascending order
		TreeSet ts = new TreeSet(hs);
		System.out.println("Treeset: " + ts);

		// Descending order
		TreeSet set = new TreeSet(Collections.reverseOrder());
		set.addAll(hs);
		System.out.println("Treeset: " + set);

	}
}
