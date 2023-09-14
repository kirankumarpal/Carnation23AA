package com.starpattern;

public class Number_decrement {
	public static void main(String[] args) {
		int n = 5;
		int num = 1;
		for (int i = 1; i <= n; i++) {
			int k = num + i - 1;
			for (int j = 1; j <= i; j++) 	{
				System.out.print(k + " ");
				k--;
			}
			num = num + i;
			System.out.println();
		}
	}
}
