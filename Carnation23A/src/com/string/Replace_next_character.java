package com.string;

public class Replace_next_character {
	public static void main(String[] args) {
		String s = "01=123=4=56=789";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '=') {
				System.out.print(s.charAt(i + 1) + " ");
			}
		}
	}
}
