package com.starpattern;

public class Reverse_Pyramid_Pattern {
	public static void main(String[] args) {
		int n = 10;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
