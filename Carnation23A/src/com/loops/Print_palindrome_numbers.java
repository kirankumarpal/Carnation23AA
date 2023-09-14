package com.loops;

public class Print_palindrome_numbers {

	public static void main(String[] args) {

		for (int orignum = 1; orignum <= 100; orignum++) {
			int tempnum = orignum;
			int revnum = 0;
			int rem = 0;

			while (tempnum > 0) {
				rem = tempnum % 10;
				revnum = (revnum * 10) + rem;
				tempnum = tempnum / 10;
			}

			if (orignum == revnum) {
				System.out.print(orignum + ", ");
			}
		}
	}
}
