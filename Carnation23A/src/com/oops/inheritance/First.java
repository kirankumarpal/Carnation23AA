package com.oops.inheritance;

public class First {

	final int x;
	int y = 10;

	public void m1() {

	}

	public void m12() {
		System.out.println("m12 method");
	}

	static {
		System.out.println("I am static block");
	}

	public First() {
		System.out.println("I am constructor");
//		x = 10;
		System.out.println(x);
	}

	{
		System.out.println("I am instance block");
		x = 50;
		System.out.println(x);
	}

	public static void main(String[] args) {
		First i = new First();
		i.m12();
	}
}
