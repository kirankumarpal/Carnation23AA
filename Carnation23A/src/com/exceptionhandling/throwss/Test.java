package com.exceptionhandling.throwss;

public class Test {
	public static void main(String[] args) {
		First f = new First();
		try {
			System.out.println(f.divideNum(50, 0));
		} catch (Exception e) {
			System.out.println("Divisor cannot be zero");
		}
	}
}
