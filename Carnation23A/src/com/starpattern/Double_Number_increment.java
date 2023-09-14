package com.starpattern;

public class Double_Number_increment {
	public static void main(String[] args) {
		int n = 5;
		int num = 1;

		for (int i = 0; i <= n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num = num + 2;
			}
			num = (i * 2) - 1;
			num = num + 4;
			System.out.println();
		}

	}
}
