package com.string;

public class Replace_special_characters {
	public static void main(String[] args) {
		String s = "Hello!!!!! Testing_Shastra";
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
			s= s.replaceAll("[^a-z A-Z 0-9]", "X");
//			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == ' ') {
//
//			} else {
//				s = s.replace(s.charAt(i), 'x');
//			}
//		}
		System.out.println(s);
	}
}
