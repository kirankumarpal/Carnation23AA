// print second max number

package com.array;

public class Second_largest_using_2_variables {

	public static void main(String[] args) {

		int[] x = { 11, 45, 12, 19, 23, 45, 45 };
		int max = x[0];
		int secmax = x[0];

		for (int i = 1; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		System.out.println(max);

		for (int i = 0; i < x.length; i++) {
			if (x[i] > secmax && x[i] < max) {
				secmax = x[i];
			}
		}
		System.out.println(secmax);
	}
}
