package com.array;

import java.util.Arrays;

public class Triplets_equal_to_value {

	public static void main(String[] args) {
		int num = 7;
		int[] x = { 1, 6, 3, 0, 8, 4, 1, 7 };
		Arrays.sort(x);
		boolean b = true;
		
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				for (int j2 = j + 1; j2 < x.length; j2++) {
					if (x[i] + x[j] + x[j2] == num) {
						b = true;
					} else {
						b = false;
					}

					if (b) {
						System.out.print(x[i] + ", " + x[j] + ", " + x[j2]);
						System.out.println();
					}
				}
			}
		}
	}
}