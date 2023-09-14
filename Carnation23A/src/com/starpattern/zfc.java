package com.starpattern;

public class zfc {
	public static void main(String[] args) {
		int n = 5;
		int[] pattern = new int[n * (n + 1) / 2]; // Calculate the size of the 1D array

		int currentNumber = 1;
		int index = 0;

		for (int row = 1; row <= n; row++) {
			int temp = currentNumber;

			for (int col = 1; col <= row; col++) {
				pattern[index] = temp;
				temp += n - col + 1;
				index++;
			}

			currentNumber += 1;
		}

		// Print the pattern
		int currentIndex = 0;
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(pattern[currentIndex] + " ");
				currentIndex++;
			}
			System.out.println();
		}
	}
}
