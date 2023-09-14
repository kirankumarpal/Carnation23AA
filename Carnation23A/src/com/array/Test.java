package com.array;

public class Test {
	public static void main(String[] args) {
		char ch[] = { 'p', 'r', 's', 't', 'v', 'z' };

		char temp[] = new char[26];
		char j = ch[0];
		for (int i = 0; i < temp.length; i++) {
			j++;
			System.out.println(temp[j]);
		}
//		for (int i = 0; i < temp.length; i++) {
//			System.out.println(temp[j]);
//		}
	}
}
