package com.array;

//import java.util.Arrays;

public class Ascending_number {
	public static void main(String[] args) {
		int x[] = { 5, 4, 11, 78 };
		int temp = 0;
//		Arrays.sort(x);
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
			System.out.print(x[i] + " ");
		}
	}
}
