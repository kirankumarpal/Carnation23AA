//store elements of one array in new empty array in reverse order

package com.array;

public class Store_in_new_empty_array_in_reverse_order {
	public static void main(String[] args) {
		int[] x = { 23, 11, 45, 12, 19, 45, 12, 45 };
		int[] emptyarray = new int[x.length];
		int j = 0;

		for (int i = x.length - 1; i >= 0; i--) {
			emptyarray[j] = x[i];
			j++;
		}

		for (int i = 0; i < emptyarray.length; i++) {
			System.out.print(emptyarray[i]);
			if (i < emptyarray.length-1) {
				System.out.print(", ");
			} else {
				System.out.print(".");
			}
		}
	}
}