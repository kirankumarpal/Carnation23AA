package com.oops.polymorphism;
/**
 * @author kp
 * Rules
 * 1. Methods name must be same
 * 2. Methods must be in same class
 * 3. Different list of arguments
 * 4. Return type does not matter
 */
public class Overloading {
	public void m1() {
		System.out.println("m1");
	}

	public int m1(int i) { // m1 method is overloaded
		return i;
	}

	public Overloading() {
		System.out.println("constructor");
	}
	
	public Overloading(int i) { // constructor is overloaded
		System.out.println("constructor i");
	}
	public static void main(String[] args) {
		Overloading ov = new Overloading();
		Overloading ov1 = new Overloading(10);
	}
}
