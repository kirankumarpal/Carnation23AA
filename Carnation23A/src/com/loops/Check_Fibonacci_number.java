package com.loops;

public class Check_Fibonacci_number {
	public static void main(String[] args) {
		int num = 100;
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;

		while (num3 <= num) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
		
		if (num == num3) {
			System.out.println(num + " belongs to fibonacci series");
		} else {
			System.out.println(num + " doesn't belong to fibonacci series");
		}
	}
}