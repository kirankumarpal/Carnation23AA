package com.practice;

public class T4 {

	static {
		System.out.println("I am static");
	}

	public static void main(String[] args) {
		T5.m2();
		System.out.println(T5.j);
	}
}
