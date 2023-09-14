package com.starpattern;

public class Star_in_letter_pyramid {

	public static void main(String[] args) {
		int n = 6;

		for (int i = 0; i <= n; i++) {
			char c = 'a';
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == n || i == j) {
					System.out.print(c + " ");
					c++;
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
