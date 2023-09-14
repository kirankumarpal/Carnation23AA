package com.array;

import java.util.Arrays;

public class Largest_gap_bet_elements {

	public static void main(String[] args) {
		int x[] = { 23, -2, 45, 38, 12, 4, 6 };
		Arrays.sort(x);
		int temp = 0;

		for (int i = 0; i < x.length - 1; i++) {
			
			int max = 0;
			max = x[i + 1] - x[i];

			if (max > temp) {
				temp = max;
			}
		}
		System.out.println(temp + " is the largest gap between 2 consecutive elements in a sorted array");
	}
}
