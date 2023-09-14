package com.array;

public class Missing_number_from_an_array {
	public static void main(String[] args) {
		int ch[] = { 1, 4, 6, 7, 9, 12 };

		for (int i = 0; i < ch.length - 1; i++) {
			for (int j = ch[i]; j < ch[i + 1]; j++) {
				if (ch[i + 1] - j > 1) {
					System.out.print((j + 1) + " ");
				}
			}
		}
	}
}
