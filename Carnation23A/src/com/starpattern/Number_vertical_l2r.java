package com.starpattern;

public class Number_vertical_l2r {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 0; i <= n; i++) {
			int num = i + 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num = num + n - j;
			}
			System.out.println();
		}
	}
}
