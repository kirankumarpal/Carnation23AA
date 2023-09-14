package com.string;

public class Add_all_digits_numbers {
	public static void main(String[] args) {
		String s = "He110 123 jav11 and 5";
		int sum = 0;
		String temp = "0";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c))
				temp = temp + c;
			else {
				sum = sum + Integer.parseInt(temp);
				temp = "0";
			}
		}
		System.out.println(sum + Integer.parseInt(temp));
	}
}
   