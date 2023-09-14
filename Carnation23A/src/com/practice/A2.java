package com.practice;

public class A2 extends A1 {
	public static void main(String[] args) {
		int x = 10;
		int y = 15;
		
		if (y > x) {
			System.out.println(y);
		} else {
			System.out.println(x);
		}

		int max = (y > x) ? y : x;
		System.out.println(max);
	}
}
