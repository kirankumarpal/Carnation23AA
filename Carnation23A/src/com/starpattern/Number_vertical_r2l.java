package com.starpattern;

public class Number_vertical_r2l {
	public static void main(String[] args) {
		int n = 10;
		int temp = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print("   ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(temp + " ");
				temp = temp - n + 1;
			}
			System.out.println();
			temp = (n * i) + 1;
		}
	}
}