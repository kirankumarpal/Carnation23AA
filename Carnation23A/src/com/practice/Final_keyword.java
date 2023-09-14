package com.practice;

public final class Final_keyword {
	final int i;
	int x = 50;

	public Final_keyword() {

		i = 5;
		System.out.println(i);
	}

	public final boolean m123() {
		System.out.println("m123");
		return false;
	}

	public static void main(String[] args) {
		Final_keyword fk = new Final_keyword();
		System.out.println(fk.i);
	}
}
