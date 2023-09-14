package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_Mobile_No {
	public static void main(String[] args) {
		String mobNo = "9922211467";

		Pattern p = Pattern.compile("^[7-9]\\d{9}");
		Matcher m = p.matcher(mobNo);

		if (m.matches()) {
			System.out.println("It is a valid mobile number.");
		} else {
			System.out.println("It is an invalid mobile number.");
		}
	}
}
