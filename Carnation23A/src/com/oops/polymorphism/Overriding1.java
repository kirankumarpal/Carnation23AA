package com.oops.polymorphism;

/**
 * @author kp Rules 1. Methods name must be same 2. Methods must be in different
 *         class 3. Same list of arguments 4. Return type matters 4.1 if
 *         primitive then shall be same. 4.2 if non primitive then covarient
 *         return type(Object>String possible. (Big>Small) 5. We cannot reduce
 *         the visibility of child class
 */
public class Overriding1 {
	public void m1() {
		System.out.println("m1 of O1");
	}

	public int m2(int a, int b) {
		return a + b;
	}

	public Overriding1() {
		System.out.println("Cons of 1");
	}
	
	public static void main(String[] args) {
		Overriding2 obj2 = new Overriding2();
		obj2.m1();
	}
}
