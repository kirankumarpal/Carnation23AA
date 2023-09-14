package com.loops;

public class Print_armstrong_number {
	public static void main(String[] args) {
		int n = 100;
		for (int num = 0; num <= n; num++) {
			int rem = 0;
			int revnum = 0;
			int count = 0;
			int othernum = num;
			int armnum = othernum;

			while (othernum > 0) {
				othernum = othernum / 10;
				count++;
			}
//		System.out.println(count);

			while (armnum > 0) {
				rem = armnum % 10;
				revnum = (int) ((revnum) + Math.pow(rem, count));
				armnum = armnum / 10;
			}
//		System.out.println(revnum);

			if (num == revnum) {
				System.out.print(num);
				if (num < n - 1) {
					System.out.print(", ");
				} else {
					System.out.print(".");
				}
			}
		}
	}
}