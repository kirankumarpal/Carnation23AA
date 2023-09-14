package com.oops.abstraction;

/**
 * @author kp Multiple inheritance is possible in Interface with same method
 *         written in 2 different interfaces can be overridden with same
 *         type(return type, list of arguments.)
 * 
 *         default & static concrete methods cannot be implemented as both have
 *         body.
 */
public class Child implements Parent1, Parent2 {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.m1(10);
	}

	@Override
	public void m1(int i) {
		// TODO Auto-generated method stub

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

}
