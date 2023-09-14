package com.starpattern;

public class Number_Decrement1 {
	public static void main(String[] args) {
		int n = 6;
		int num = 1;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print(num + " ");
					num--;
				} else {
					System.out.print(num + " ");
					num++;
				}
			}
			if (i % 2 == 0) {
				num = num + i + 1;
			} else {
				num = num + i;
			}
			System.out.println();
		}
	}
}
