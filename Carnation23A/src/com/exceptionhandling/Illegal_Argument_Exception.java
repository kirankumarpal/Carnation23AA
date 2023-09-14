package com.exceptionhandling;

public class Illegal_Argument_Exception {

	public static void checkOddNumber(int number) {
		if (number % 2 != 0) {
			throw new IllegalArgumentException("Number is odd");
		}
	}

	public static void checkOddorEven(int number) {
		try {
			checkOddNumber(number);
			System.out.println(number + " is even");
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		checkOddorEven(50);
	}
}
