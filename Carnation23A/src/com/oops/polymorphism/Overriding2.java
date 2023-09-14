package com.oops.polymorphism;

public class Overriding2 extends Overriding1 {
	
	@Override
	public void m1() {
		System.out.println("m1 of Overriding2");
	}

	public static void main(String[] args) {
		Overriding2 obj2 = new Overriding2();

		System.out.println(obj2.m2(5, 10));
	}
}
