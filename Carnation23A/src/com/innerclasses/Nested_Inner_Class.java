package com.innerclasses;

/**
 * @author KP Static method in inner class is applicable only from Java 16.
 * 
 */

public class Nested_Inner_Class {
	int i = 50;

	public	 class T7 {
		int i = 10;
		static int j = 20;

		static public int m2() {
			return 5000;
		}
	}

	public static void main(String[] args) {
		T7 t = new Nested_Inner_Class().new T7();
		System.out.println(t.i);
		System.out.println(T7.j);
		System.out.println(T7.m2());
	}
}
