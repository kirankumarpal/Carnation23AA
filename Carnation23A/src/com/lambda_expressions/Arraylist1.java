package com.lambda_expressions;

import java.util.ArrayList;

public class Arraylist1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);

		al.forEach(n -> System.out.print(n + " "));
	}
}
