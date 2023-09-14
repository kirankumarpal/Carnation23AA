package com.practice;

import java.util.Arrays;

public class P2 {

	public static void main(String[] args) {

		int x[] = { 5, 9, 8, 25 };
		Arrays.sort(x);
		System.out.println(Arrays.binarySearch(x, 25));

		String s1 = "java";
		String s2 = "java";
		System.out.println(s1 == s2);
		System.out.println(s2.equals(s2));

	}
}
