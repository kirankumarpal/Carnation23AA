package com.practice;

import java.util.*;

public class Substringcomparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of first array: ");
		int n = sc.nextInt();
		int arr1[] = new int[n];

		System.out.println("Enter " + n + " element for first array: ");
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter size of second array: ");
		int n1 = sc.nextInt();

		int arr2[] = new int[n1];
		System.out.println("Enter " + n1 + " element for second array: ");

		for (int i = 0; i < n1; i++) {
			arr2[i] = sc.nextInt();
		}
		int arr3[] = new int[arr1.length + arr2.length];
		int count = 0;

		// copy arr1 elments to arr3
		for (int i = 0; i < arr1.length; i++) {
			arr3[count] = arr1[i];
			count++;
		}
		// copy arr2 element to arr3
		for (int i = 0; i < arr2.length; i++) {
			arr3[count] = arr2[i];
			count++;
		}

		// print merge array element
		System.out.println("Merged array element: ");
		for (int i = 0; i < count; i++) {
			System.out.print(arr3[i] + " ");
		}
		sc.close();
	}
}
