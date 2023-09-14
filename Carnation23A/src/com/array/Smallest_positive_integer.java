package com.array;

import java.util.Arrays;

/**
 * @author kp Find the smallest positive integer that does not occur in a given
 *         sequence. Write a logic that, given an array A of N integers, returns
 *         the smallest positive integer (greater than 0) that does not occur in
 *         A. For example, given A= [1, 3, 6, 4, 1, 2], the function should
 *         return 5. Given A = [1, 2, 3], the function should return 4. Given A=
 *         [-1,-3],the function should return 1. Write an efficient algorithm
 *         for the following assumptions: N is an integer within the range
 *         [1..100,000]. each element of array A is an integer within the range
 *         [-1,000,000..1,000,000].
 * 
 *         Examples: Input: A=[1,2,3,5,6] output: 4 Input: A=[1,2,4,5,6]
 *         output:3 Input: A=[-1,2,3] output:1
 */
public class Smallest_positive_integer {
	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 5 };
		Arrays.sort(x);

		for (int i = 0; i < x.length - 1; i++) {
//			System.out.print(x[i] + " ");
			for (int j = x[i]; j < x[i + 1]; j++) {

				if (x[i + 1] - x[i] > 1) {
					if (x[i] + 1 != 0) {
						System.out.print(x[i] + 1);
						break;
					}
				}
			}
		}
	}
}
