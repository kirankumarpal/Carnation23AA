package com.loops;

//153 = 1^3 + 5^3 + 3^3

public class Check_armstrong_number {

	public static void main(String[] args) {
		int num = 153;
		int rem = 0;
		int revnum = 0;
		int count = 0;
		int othernum = num;
		int armnum = num;

		while (num > 0) {
			num = num / 10;
			count++;
		}
//		System.out.println(count);

		while (othernum > 0) {
			rem = othernum % 10;
			revnum = (int) ((revnum) + Math.pow(rem, count));
			othernum = othernum / 10;
		}
//		System.out.println(revnum);

		if (armnum == revnum) {
			System.out.println(armnum + " is an armstrong number");
		} else {
			System.out.println(armnum + " is not an armstrong number");
		}
	}
}
