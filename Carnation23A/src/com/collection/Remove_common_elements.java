package com.collection;

import java.util.ArrayList;

public class Remove_common_elements {
	public static void main(String[] args) {
		int x[] = { 10, 15, 80, 25, 69, 89 };
		int y[] = { 10, 51, 80, 29, 69, 89 };
		ArrayList ax = new ArrayList();
		for (int i = 0; i < x.length; i++) {
			ax.add(x[i]);
		}
		ArrayList ay = new ArrayList();
		for (int i = 0; i < x.length; i++) {
			ay.add(y[i]);
		}
		ax.retainAll(ay);
		System.out.println(ax);
	}
}
