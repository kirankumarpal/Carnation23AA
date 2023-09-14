package com.lambda_expressions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);

		Consumer c = n -> System.out.print(n + " ");
		al.forEach(c);
	}
}
