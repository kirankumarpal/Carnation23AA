package com.string;

import java.util.*;

public class Check_palindrome {
	public static void main(String[] args) {
		System.out.println("Check whether a string is palindrome or not.");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String rev = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}

		if (input.equals(rev)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
		sc.close();
	}
}
