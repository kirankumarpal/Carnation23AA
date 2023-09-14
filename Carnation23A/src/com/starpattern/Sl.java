package com.starpattern;

public class Sl {
	public static void main(String[] args) {
		int n = 5; 

		for (int i = 0; i <= n; i++) {
			char c = 'a';
			for (int j = n - 1; j >= i; j--) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				if (j==0) {
					System.out.print(" * ");
				} else {
					System.out.print(c + " * ");
					c++;
				}
			}
			System.out.println();
		}
	}
}
