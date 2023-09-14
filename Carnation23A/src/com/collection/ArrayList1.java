package com.collection;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
//		Object[] x = { 10, 11, 12, 13, 15, 16, "Hello" };
//		ArrayList<Object[]> l1 = new ArrayList<Object[]>();
//
//		for (int i = 0; i < x.length; i++) {
//			l1.add(x);
//		}

		ArrayList l1 = new ArrayList();
		l1.add(10);
		l1.add(11);
		l1.add(12);
		l1.add("Hello");

		System.out.println("size " + l1.size());
		l1.trimToSize();
		System.out.println("trimmed size " + l1.size());

		ArrayList l2 = new ArrayList();

		l2.add(10);
		l2.add(11);
		l2.add("Hello");
		l2.add(12);

		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println(l1.isEmpty());
		System.out.println(l1.contains("Hello"));
		System.out.println(l1.iterator());
		System.out.println(l1.toArray());
		System.out.println(l1.add("Hi"));
//		System.out.println(l1.remove("Hello"));
		System.out.println(l1.containsAll(l2));
		System.out.println(l1.retainAll(l2));
//		l1.clear();
		System.out.println(l1);
		System.out.println(l1.equals(l2));
		System.out.println(l1.hashCode());
		System.out.println(l1.get(2));
		System.out.println(l1.set(0, 90));
		System.out.println(l1);
		l1.add(0, l2);
		System.out.println(l1);
		l1.remove(0);
		System.out.println(l1.lastIndexOf("Hello"));
		System.out.println(l1.listIterator());
	}
}
