package com.oops.inheritance;

public class Second extends First{
	public void m1() {

	}
	public void m2() {
		super.m1();
	}
	public static void main(String[] args) {
		Second f = new Second();
		f.m2();
	}
}
