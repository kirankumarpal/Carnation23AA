//reverse of digits in array

package com.array;

public class Reverse_of_digits_inarray {
	public static void main(String[] args) {
		int x[] = { 12, 45, 67, 23, 11, 79, 38 };

		System.out.print("Reverse of digits in array are: ");

		for (int i = 0; i < x.length; i++) {
			int sum = 0;
			int rem = 0;

			while (x[i] != 0) { // check whether element in i index is greater than zero.
				rem = x[i] % 10; // remainder of 12%10 is 2.
				sum = (sum * 10) + rem; // sum of (0*10)+2 is 2.
				x[i] = x[i] / 10; // 12/10 is 1.2 i.e x[1]=1
			}
			System.out.print(sum + ", ");
		}
	}
}
