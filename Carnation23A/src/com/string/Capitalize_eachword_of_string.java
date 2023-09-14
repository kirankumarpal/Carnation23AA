package com.string;

public class Capitalize_eachword_of_string {
	public static void main(String[] args) {
		String s = ("my naMe is KirAnKumaR");
		String[] s1 = s.split(" ");

		for (int i = 0; i < s1.length; i++) {
//			System.out.println(s1[i]);
			String a = s1[i].substring(0, 1).toUpperCase();
			String b = s1[i].substring(1).toLowerCase();
			String c = a + b;
			System.out.print(c + " ") ;
		}
	}
} 
