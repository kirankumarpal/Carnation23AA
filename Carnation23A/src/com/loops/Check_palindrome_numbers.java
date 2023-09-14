package com.loops;

public class Check_palindrome_numbers {

	public static void main(String[] args) {
		int orignum = 45454;
		int rem, revnum = 0;
		int tempnum = orignum;

//		just reverse the number and check equality

		while (tempnum > 0) {
			rem = tempnum % 10;
			revnum = (revnum * 10) + rem;
			tempnum = tempnum / 10;
		}

		if (orignum == revnum) {
			System.out.println(orignum + " is a palindrome number.");
		} else {
			System.out.println(orignum + " is not a palindrome number.");
		}
	}
}
