package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		String s = "H3110 TE5T989N6 5Has72a";
		int result = 0;
		
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher(s);
		
		while (m.find()) {
			result = result+Integer.parseInt(m.group());
		}
		
		System.out.println(result);
	}
}