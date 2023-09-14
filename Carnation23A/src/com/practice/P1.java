package com.practice;

public class P1 {

	public static void m1() {
		int i = 400;
		System.out.println(i);
	}

	public void m2() {
		m1();
		System.out.println("m2");
	}

	public static void main(String[] args) {
		P1 p = new P1();
		p.m2();
	}
}

/*
 * series of execution...
 * static block
 * instance block
 * constructor
 * 
 */
