//count of duplicate elements.

package com.array;

public class Count_of_duplicate_elements {
	public static void main(String[] args) {
		int[] x = { 11, 13, 15, 11, 45, 13, 18, 32, 15, 11 };

		for (int i = 0; i < x.length; i++) {
			int count = 1;
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j]) {
					count++;
					x[j] = 0;
				}
			}
			if (count > 1 && x[i] != 0) {
				System.out.println(x[i] + " " + count);
			}
		}
	}
}
