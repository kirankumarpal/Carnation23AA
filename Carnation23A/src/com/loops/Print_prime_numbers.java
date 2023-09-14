package com.loops;

public class Print_prime_numbers {

	public static void main(String[] arguments) {
		System.out.print("Prime numbers are: ");
		for (int i = 2; i <= 100; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count > 2) {

			} else {
				System.out.print(i + "  ");
			}
		} 
	}
}
