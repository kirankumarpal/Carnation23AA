package com.regex;

public class Check_whether_string_has_azAZ09 {
	public static boolean contains(String s) {
		return (s.matches("[\\w]+$"));
	}

	public static void main(String[] args) {
		System.out.println(contains("Hello12a"));
	}
}
