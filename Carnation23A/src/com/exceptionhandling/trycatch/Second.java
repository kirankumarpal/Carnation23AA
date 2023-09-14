package com.exceptionhandling.trycatch;

public class Second {
	public static void main(String[] args) {
		try {
			int x = 0;
			int y = 5 / x;
			System.out.println(y);
		} catch (Exception e) {
			System.out.println("Exception");
//		} catch (ArithmeticException ae) {		// If a try is handle with parent you cannot handle it again with child
//			System.out.println("Exception");	
		} finally {
			System.out.println("finished");
		}
	}
}
