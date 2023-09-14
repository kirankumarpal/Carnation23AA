//second largest number in the array by using third variable & array

package com.array;

public class Second_largest_using_third_variable {

	public static void main(String[] args) {

		int[] x = { 23, 11, 45, 12, 19, 45, 12, 45, 45 };
		int temp = 0;
		int[] empty = new int[x.length];
		int k = 0;
		
//		arrange in ascending order.

		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
			// System.out.println(x[i]); // 11 12 12 19 23 45 45 45
		}

//		remove the duplicate elements and enter all elements in new empty array.
		
		for (int i = 0; i < x.length - 1; i++) {
			if (x[i] != x[i + 1]) {
				empty[k] = x[i];
				k++;
			}
			empty[k] = x[x.length - 1];
//			System.out.println(empty[i]); //not able to understand the behavior of array
		}

//		for (int i = 0; i < x.length; i++) {
//			System.out.println(empty[i]); // 11 12 19 23 45 0 0 0
//		}

//		arrange the array in ascending order
		
		for (int i = 0; i < empty.length; i++) {
			for (int j = i + 1; j < empty.length; j++) {
				if (empty[i] > empty[j]) {
					temp = empty[i];
					empty[i] = empty[j];
					empty[j] = temp;
				}
			}
//			System.out.println(empty[i]); // 0 0 0 11 12 19 23 45
		}
		
		System.out.println("Secondlast element in the array is "+ empty[empty.length-2]+ ".");
	}
}
