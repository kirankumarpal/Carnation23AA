package com.starpattern;

public class Letter_pyramid {

	public static void main(String[] args) {

		int rows = 5;
		for (int i = 0; i < rows; i++) {
			char c = 'A';
			for (int j = rows - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(c + " ");
				c++;
			}

			System.out.println();
		}
	}
}
