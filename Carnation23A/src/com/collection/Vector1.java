package com.collection;

import java.util.*;

public class Vector1 {
	public static void main(String[] args) {
		Vector v = new Vector();
//		v.add(10);
//		v.add("Hello");
//		v.add(11);
//		v.add(12);
//		v.add("Hello");
//		v.add(13);
//		v.add("Hi");
//		v.add(null);
//		System.out.println(v);

		Stack sc = new Stack();
		
		sc.add(10);
		sc.add(25);
		sc.add("Hello");
//		System.out.println(sc.pop());
		sc.push(80);
//		sc.pop();
		sc.add(13);
//		System.out.println(sc.peek());
		sc.add("Hi");
		sc.add(null);
		sc.add(13);
		
		System.out.println(sc);
		System.out.println(sc.get(5));
//		System.out.println(sc.empty());
		System.out.println(sc.search(null));
		
	}
}
