package com.string;

public class Add_all_digits {
	public static void main(String[] args) {
		String s = "wifi password 0f 1 Testing_Shastra is 1234";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				sum = sum + s.charAt(i)-'0';
			}
		}
		System.out.println(sum);
	}
}
