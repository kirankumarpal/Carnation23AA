package com.array;

import java.util.Arrays;

public class Numbers_are_consecutive {

	public static void main(String[] args) {
		int[] x = { 1, 2, 5, 7, 8, 0, 4, 3, 6 };
		Arrays.sort(x);
		boolean b = true;

		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j] - 1) {
					b = true;
				} else {
					b = false;
					break;
				}
			}
		}

		if (b) {
			System.out.println("Numbers in an array can be rearranged so that each number appears exactly once in a consecutive list of numbers");
		} else {
			System.out.println("Numbers in an array cannot be rearranged so that each number appears exactly once in a consecutive list of numbers");
		}
	}
}
