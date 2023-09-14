package com.Covarient_datatype;

public class Parent {
	public Object m1() {
		String s = "m1 of Parent";
		return s;
	}

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.m1());
	}
}
