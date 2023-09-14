package com.loops;

public class Print_Fibonacci_number {
	public static void main(String[] args) {
		int num = 100;
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;

		while (num3 <= num) {
			num3 = num1 + num2;
			if (num3 <= num) {
				System.out.print(num3 + " ");
			}
			num1 = num2;
			num2 = num3;
		}
	}
}
