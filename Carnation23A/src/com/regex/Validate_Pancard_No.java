package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_Pancard_No {
	public static void main(String[] args) {
		String panNo = "CYTpP7358b";

		Pattern p = Pattern.compile("[A-Z/a-z]{5}[0-9]{4}[A-Z/a-b]{1}");
		Matcher m = p.matcher(panNo);

		if (m.matches()) {
			System.out.println("It is a valid pan number.");
		} else {
			System.out.println("It is an invalid pan number.");
		}
	}
}