package com.practice;

public class Test2 {
	private int m1(int x, int y, int z) {
		return x + y + z;
	}

	private int m1(int x, int y) {
		return x + y;
	}

	public Test2() {
		System.out.println("This is zero argument constructor");
	}

	public Test2(int y) {
		System.out.println("This is one argument constructor");
	}
	
	public static void main(String[] args) {
		Test2 t2 = new Test2();
//		Test2 t21 = new Test2(5);
		System.out.println(t2.m1(5, 5, 5));
		System.out.println(t2.m1(5, 5));
	}
}
