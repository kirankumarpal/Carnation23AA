package com.practice;

public class T3 {
	public static void main(String[] args) {

		char ch[] = { 'p', 'r', 's', 't', 'v', 'z' };
		int arr[] = new int[ch[ch.length - 1] - ch[0]];
		char start = ch[0];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = start;
			start++;
		}

		for (char c : ch) {
			int temp = c;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == temp) {
					arr[j] = 0;
				}
			}
		}
		for (int k : arr) {
			if (k != 0) {
				char c = (char) k;
				System.out.print(c + " ");
			}
		}
	}
}
