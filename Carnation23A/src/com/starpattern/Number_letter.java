package com.starpattern;

public class Number_letter {

	public static void main(String[] args) {
		int rows = 10;

		for (int i = 1; i < rows; i++) {
			char c = 'a';
			int num = 1;
			for (int j = rows - 1; j > i; j--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print(num + " ");
					num++;
				} else {
					System.out.print(c + " ");
					c++;
				}
			}
			System.out.println();
		}
	}
}
