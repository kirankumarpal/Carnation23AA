package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Print_duplicates {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("kiran");
		al.add("kiran");
		al.add("gaurav");
		al.add("supriya");

		Set<String> duplicates = new HashSet<>();
		Set<String> uniqueElements = new HashSet<>();

		for (String s : al) {
		    if (!uniqueElements.add(s)) {
		        duplicates.add(s);
		    }
		}

		System.out.println("Duplicate elements: " + duplicates);
	}
}
