package com.practice;

public class A1 {

	public void m1(byte i) {
		System.out.println("byte i");
	}

	public void m1(int i) {
		System.out.println("int i");
	}

	public static void main(String[] args) {
		A1 a = new A1();
		a.m1(10);
		int i = 588;
		System.out.println(i);
	}
}
