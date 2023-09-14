package com.string;

public class Three_consecutive_letters {

	// Function to generate and print the required string
	static void generateString(int A, int B) {
		String rt = "";
		while (A > 0 || B > 0) {

			// More 'a', will add "aab"
			if (A > B) {
				if (A > 0) {
					rt = rt + 'a';
					A--;
				}
				if (A > 0) {
					rt = rt + 'a';
					A--;
				}
				if (B > 0) {
					rt = rt + 'b';
					B--;
				}
			}

			// More 'b', will add "bba"
			else if (B > A) {
				if (B > 0) {
					rt = rt + 'b';
					B--;
				}
				if (B > 0) {
					rt = rt + 'b';
					B--;
				}
				if (A > 0) {
					rt = rt + 'a';
					A--;
				}
			}

			// Equal number of 'a' and 'b' will add "ab"
			else {
				if (A > 0) {
					rt = rt + 'a';
					A--;
				}
				if (B > 0) {
					rt = rt + 'b';
					B--;
				}
			}
		}
		System.out.println(rt);
	}

	public static void main(String[] args) {
		int A = 5, B = 1;
		generateString(A, B);
	}
}
