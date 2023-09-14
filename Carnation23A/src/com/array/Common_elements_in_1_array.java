// same elements in 1 arrays.

package com.array;

public class Common_elements_in_1_array {

	public static void main(String[] args) {
		int[] x = { 11, 13, 15, 11, 45, 13, 18, 32, 15 };
		int count = 0;

		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j]) {
					count++;
					System.out.println(x[i]);
				}
			}
		}
		System.out.println(count);
	}
}