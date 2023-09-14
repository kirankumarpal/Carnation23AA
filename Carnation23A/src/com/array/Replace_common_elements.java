package com.array;

public class Replace_common_elements {
	public static void main(String[] args) {

		int[] x = { 23, 11, 45, 67, 91, 56, 78 };
		int[] y = { 61, 84, 23, 33, 11, 56 };

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if (x[i] == y[j]) {
					x[i] = 0;
				}
			}
			System.out.print(x[i] + " ");
		}

	}
}
