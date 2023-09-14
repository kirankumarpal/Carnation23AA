package com.array;

public class Addition_of_elements {
	public static void main(String[] args) {
		int x[] = { 12, 50, 8, 986, 36 };
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		System.out.println(sum);
	}
}
