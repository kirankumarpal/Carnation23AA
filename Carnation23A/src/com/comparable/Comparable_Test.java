package com.comparable;

/**
 * Comparable is interface
 * Avoid java.lang.ClassCastException 
 */

import java.util.TreeSet;

public class Comparable_Test {
	public static void main(String[] args) {
		Comparable_class kp = new Comparable_class("Kiran", 5, 55f);
		Comparable_class gb = new Comparable_class("Gaurav", 8, 85f);
		Comparable_class sm = new Comparable_class("Supriya", 9, 18f);
		Comparable_class me = new Comparable_class("Mangesh", 10, 95f);
		Comparable_class rn = new Comparable_class("Roshan", 28, 98f);

		TreeSet ts = new TreeSet();
		ts.add(kp);
		ts.add(gb);
		ts.add(sm);
		ts.add(me);
		ts.add(rn);

		System.out.println(ts);
	}
}
