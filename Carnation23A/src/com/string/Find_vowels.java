package com.string;

public class Find_vowels {
	public static void main(String[] args) {
		String s = "Hello Testing Shastra";
		String v = "aeiou";
		System.out.print("The vowels present in '" + s + "' are: ");
		char[] s1 = s.toCharArray();
		char[] v1  = v.toCharArray();
		char[] empty = new char[v.length()];

		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < v1.length; j++) {
				if (empty[j] != v1[j]) {
					if (s1[i] == v1[j]) {
						empty[j] = v1[j];
						System.out.print(v1[j] + " ");
					}
				}

			}
		}
	} 
}
