package com.string;

public class Occurence_chars_in_string {
	public static void main(String[] args) {
		String a = "hellooo";
		
		a = a.toLowerCase();
		char[] ch = a.toCharArray() ;

		System.out.println("Occurance of characters in a given string");

		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '0';
				}
			}
			if (ch[i] != '0') {
				System.out.println(ch[i] + " = " + count);
			}
		}
	}
}