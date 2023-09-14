package com.starpattern;

public class Letter_in_star {

	public static void main(String[] args) {
		int rows = 4;
		int num = 1;
		for (int i = 0; i <= rows; i++) {
			
			for (int j = 0; j <= rows; j++) {
				if (i == 0 || j == 0 || i == rows || j == rows) {
					System.out.print("* ");
				} 
				else {
					System.out.print(num + " ");
					num++;
				}
			}
			System.out.println();
		}
	}
}
