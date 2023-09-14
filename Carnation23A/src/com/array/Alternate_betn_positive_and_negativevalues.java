package com.array;

public class Alternate_betn_positive_and_negativevalues {
	public static void main(String[] args) {
		int x[] = { 1, -2, 5, -4, 3, -6 };
		boolean b = true;

		for (int i = 0; i < x.length - 1; i++) {
			if (x[i] > 0 && x[i + 1] < 0) {
				b = true;
			} else if (x[i] < 0 && x[i + 1] > 0) {
				b = true;
			} else {
				b = false;
				break;
			}
		}

		if (b) {
			System.out.println("Array of integers alternates between positive and negative values");
		} else {
			System.out.println("Array of integers does not alternate between positive and negative values");
		}
	}
}
