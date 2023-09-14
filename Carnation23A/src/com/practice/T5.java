package com.practice;

public class T5 {
	 static int j = 10;

	private T5() {
		System.out.println("Cons of t5");
	}

	public static String m1(int x, int y) {
		int c = x + y;
		String s = Integer.toString(c);
		return s;
	}

	public static void m2() {
		System.out.println("m2 of T5");
	}

	public static void main(String[] args) {
//		T5 t = new T5();
		System.out.println(m1(5, 1));
		System.out.println(j);
	}
}
