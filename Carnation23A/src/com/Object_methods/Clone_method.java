package com.Object_methods;

public class Clone_method implements Cloneable {

	int x = 35;

	public static void main(String[] args) throws CloneNotSupportedException {
		Clone_method om = new Clone_method();
		Clone_method om2 = (Clone_method) om.clone();
		System.out.println(om2.x);
 	}
}
