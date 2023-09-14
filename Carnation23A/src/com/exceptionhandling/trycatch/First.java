package com.exceptionhandling.trycatch;

public class First {
	public static void m1() {
		System.out.println(50 / 0);
	}

	public static void m2() {
		m1();
	}

	public static void m3() {
		try {
			m2();
		} catch (Exception e) {
			System.out.println("askldfasdkjbcksjdnlsd");
		}

	}

	public static void main(String[] args) {
//		try {
//			int a = 10;
//			int b = 0;
//			int c = a / b;
//			System.out.println(c);
//			System.out.println(b);
//		} 
//		catch (ArithmeticException e) {
//			System.out.println("Divisor cannot be zero or less than dividend");
//		}
//		int x = 10;
//		int y = 2;
//		System.out.println(x / y);
//		finally {
//			System.out.println(5000);
//		}
		try {
			m2();
		} catch (Exception e) {
			System.out.println("sf");
		}
		m3();

	}
}
