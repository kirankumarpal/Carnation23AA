package com.innerclasses;

public class Static_innerclass {
	public void m1() {
		System.out.println("m1 of Static_innerclass");
	}

	static class Inner {
		public static void m2() {
			System.out.println("m2 of Inner");
		}
	}

	public static void main(String[] args) {
		Static_innerclass.Inner.m2();
	}
}
