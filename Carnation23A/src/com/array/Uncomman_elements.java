package com.array;

import java.util.HashSet;

public class Uncomman_elements {
	public static void main(String[] args) {
		int[] x = { 11, 13, 15, 11, 45, 13, 18, 32, 15, 15, 11 };
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j]) {
					s.add(x[i]);
				}
			}
		}
		for (int i : s) {
			System.out.print(i);
			if (i != s.size() + 12) {
				System.out.print(", ");
			} else {
				System.out.print(".");
			}
		}
	}
}