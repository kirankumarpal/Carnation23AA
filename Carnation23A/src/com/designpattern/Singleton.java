package com.designpattern;

/**
 * Single Design Pattern - Only one object can be made.
 * @author kp
 * To create object use {@code getS} method.<br>For eg.: <b>Singleton s = Singleton.getS()</b?
 */
public class Singleton {

//	Make constructor private so that no one can create object using constructor
	private Singleton() {

	}
	
//	Static block has only one copy. Hence object shall be created in static block.
	static Singleton s;
	static {
		 s = new Singleton();
	}

//	To give access of creating object use getter method.
	public static Singleton getS() {
		return s;
	}
			
}
