//Replace digits with x
package com.string;

public class Replace_digits {
	public static void main(String[] args) {
		String s = "There are 65 apples in 8 bags";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				s = s.replace(s.charAt(i), 'X');
			}
		}
		System.out.println(s);
	}
}
