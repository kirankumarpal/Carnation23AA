package com.exceptionhandling.throww;

@SuppressWarnings("serial")
public class Fail_Exception extends RuntimeException {

	{
		System.out.println("You are fail instance block");
	}

//	static{
//		System.out.println("You are fail static block");
//	}
	public Fail_Exception() {
		System.out.println("You are fail constructor");
	}
}
