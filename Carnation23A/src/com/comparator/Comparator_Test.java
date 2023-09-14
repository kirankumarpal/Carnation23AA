package com.comparator;

/**
 * Comparator is interface
 * Avoid java.lang.ClassCastException 
 */

import java.util.TreeSet;
 
public class Comparator_Test {

	public static void main(String[] args) {
		Comparator_class kp = new Comparator_class("Kiran", 5, 55f);
		Comparator_class gb = new Comparator_class("Gaurav", 8, 85f);
		Comparator_class sm = new Comparator_class("Supriya", 9, 18f);
 		Comparator_class me = new Comparator_class("Mangesh", 10, 95f);
		Comparator_class rn = new Comparator_class("Roshan", 28, 98f);

		TreeSet ts = new TreeSet(new Marks_comparator());
		ts.add(kp);
		ts.add(gb);
		ts.add(sm);
		ts.add(me);
		ts.add(rn);

		System.out.println(ts);
	}
}
