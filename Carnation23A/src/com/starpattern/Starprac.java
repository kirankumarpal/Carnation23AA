package com.starpattern;

public class Starprac {
	public static void main(String[] args) {
		int noofrows = 5;

		for (int i = 1; i <= noofrows; i++) { // main
			for (int spaces = noofrows - i; spaces > 0; spaces--) { // sub loop
				System.out.print(" ");
			}

			for (int asterick = 1; asterick <= i; asterick++) { // sub loop
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}

/*
 * i=1, i<=5, true spaces = 5-1= 4 4>0 true 3>0 true 2>0 true 1>0 true 0>0 false
 * asterick=1 1<=1 true asterick=2 2<=1 false i=2, i<=5 2<=5 true 3<=5 true 4<=5
 * true
 * 
 * 
 * for(){
 * }
 * 
 */