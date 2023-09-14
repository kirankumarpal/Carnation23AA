//second largest number in the array by using method

package com.array;

import java.util.Arrays;

public class Second_largest_using_method {

	public static void main(String[] args) {
		int [] x = {23, 11, 45, 12, 19, 45, 12, 45};
		int [] temp = new int[x.length]; // taking temp array and defining size i.e equal to size of main array
		int j =0;		//for index of temp
		
		Arrays.sort(x);
//		for (int i = 0; i < x.length; i++) {  //prints in sorted array
//			System.out.println(x[i]);
//		}
		
		//loop to remove duplicate
		for (int i = 0; i < x.length-1; i++) { //array upto secondlast index
			if (x[i]!=x[i+1]) {
				temp[j] = x[i];
				j++;
			}
			temp[j]=x[x.length-1]; //prints last index
		}
		
//		for (int i = 0; i < x.length; i++) {
//			System.out.println(temp[i]);
//		}
		
		Arrays.sort(temp);
//		for (int i = 0; i < temp.length; i++) {
//			System.out.println(temp[i]);
//		}
		int ans = temp[temp.length-2];
		System.out.println(ans);
	}
}
