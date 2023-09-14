package com.Covarient_datatype;

public class Child extends Parent {

	@Override
	public int[] m1() {
		int[] x = { 1, 2, 3, 4 };
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		return x;
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.m1();

	}
}
