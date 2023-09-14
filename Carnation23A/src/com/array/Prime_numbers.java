package com.array;

import java.util.Arrays;

public class Prime_numbers {
	public static void main(String[] args) {
		int[] x = { 03, 37, 39, 04, 50, 60 };
		Arrays.sort(x);
		for (int i = 0; i < x.length; i++) {
			int count = 0;// if written in main method the previous count value will be taken
			for (int j = 1; j <= x[x.length-1]; j++) {
				if (x[i] % j == 0) {
					count++;
				}
			}
			if (count > 2) {
				System.out.println(x[i] + " is not a prime number.");
			} else {
				System.out.println(x[i] + " is a prime number.");
			}
		}
	}
}