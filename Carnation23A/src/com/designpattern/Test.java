package com.designpattern;

public class Test {
	public static void main(String[] args) {
		Singleton s = Singleton.getS();
		Singleton s1 = Singleton.getS();

		if (s == s1) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}
}
