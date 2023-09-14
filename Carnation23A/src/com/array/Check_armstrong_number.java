package com.array;

public class Check_armstrong_number {
//Armstrong number = 153 = 1^3+5^3+3^3

	public static void main(String[] args) {
		int[] x = { 11, 13, 45, 18, 32, 898, 15, 153, 1634 };
		int[] y = new int[x.length];
		int[] z = new int[x.length];

		for (int i = 0; i < x.length; i++) {
			y[i] = x[i];
			z[i] = x[i];
		}

		for (int i = 0; i < y.length; i++) {
			int count = 0;
			int rem = 0;
			int revnum = 0;

			while (y[i] > 0) {
				y[i] = y[i] / 10;
				count++;
			}
//			System.out.println(count);

			while (z[i] > 0) {
				rem = z[i] % 10;
				revnum = (int) (revnum + Math.pow(rem, count));
				z[i] = z[i] / 10;
			}

			if (revnum == x[i]) {
				System.out.println(x[i] + " is an armstrong number.");
			} else {
				System.out.println(x[i] + " is not an armstrong number.");
			}
		}
	}
}
