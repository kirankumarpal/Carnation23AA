//find all pairs of elements in an array whose sum is equal to a specified number

package com.array;

public class Pair_of_elements_whose_sum_isequal_to_specified_number {

	public static void main(String[] args) {
		int[] x = { 11, 34, 56, 23, 9, 13, 4, 8 };
		int num = 65;

		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] + x[j] == num) {
					System.out.println(x[i] + ", " + x[j]);
				}
			}
		}
	}
}
