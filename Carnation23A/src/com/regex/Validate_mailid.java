package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_mailid {
	public static void main(String[] args) {
		String s = "kiranuttampal1997@gmail.com";
		Pattern p = Pattern.compile("^[A-Za-z][A-Za-z0-9_.-]+[@][a-z]+[.][a-z]{2, 3}");
		Matcher m = p.matcher(s);

		if (m.matches()) {
			System.out.println("Valid Email id");
		} else {
			System.out.println("Invalid Email Id");
		}
	}
}
