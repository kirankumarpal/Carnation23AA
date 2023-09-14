package com.array;

public class Removing_duplicates {
	public static void main(String[] args) {

		int[] x = { 23, 11, 45, 12, 19, 45, 12, 45 };
		int[] temparr = new int[x.length]; // taking temp array and defining size i.e equal to size of main array
		int j = 0; // for index of temp
		int tempvar = 0;

		for (int i = 0; i < x.length; i++) {
			for (int j1 = i + 1; j1 < x.length; j1++) {
				if (x[i] > x[j1]) {
					tempvar = x[i];
					x[i] = x[j1];
					x[j1] = tempvar;
				}
			}
			// System.out.println(x[i]); // 11 12 12 19 23 45 45 45
		}

//		for (int i = 0; i < x.length; i++) { // prints in sorted array
//			System.out.print(x[i] + ", ");
//		}
//		System.out.println();
		// loop to remove duplicate
		for (int i = 0; i < x.length - 1; i++) { // array upto secondlast index
			if (x[i] != x[i + 1]) {
				temparr[j] = x[i];
				j++;
			}
			temparr[j] = x[x.length - 1]; // prints last index
		}

		for (int i = 0; i < x.length; i++) {
			System.out.print(temparr[i] + ", ");
		}
	}
}