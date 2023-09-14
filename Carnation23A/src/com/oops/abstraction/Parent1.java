package com.oops.abstraction;
/**
 * @author kp
 *
 */
public interface Parent1{
	
	int i = 50; //by default public static final
	
	public void m1(int i); // by default abstract method
	public void m2(); // by default abstract method
	
	default void x1() { // default concrete method is possible
		
	}
	
	static void x2() { // static concrete method is possible
		
	}
}
