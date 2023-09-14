package com.array;

public class Missing_letter_from_an_array {
	public static void main(String[] args) {
		char ch[] = { 'm', 'p', 'r', 's', 't', 'v', 'z' };

		for (int i = 0; i < ch.length - 1; i++) {
			for (int j = ch[i]; j < ch[i + 1]; j++) {
				if (((char) (ch[i + 1])) - ((char)(j)) > 1) {
					System.out.print((char) (j + 1) + " ");
				}
			}
		}
	}
}