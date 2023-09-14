package com.exceptionhandling.throww;

public class Test {
	public static void main(String[] args) {
		int a = 5;
		if (a < 40) {
			throw new Fail_Exception();
		} else if (a >= 40 && a < 75) {
			throw new Average_exception("You are pass, but marks are average");
		} else if (a >= 75 && a <= 100) {
			throw new First_Class_Exception("You are pass with first class distinction");
		} else {
			System.out.println("Marks cannot be greater than 100");
			System.out.println("hi");
		}
	}
}
