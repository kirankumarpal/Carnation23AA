package com.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class List_names {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List_names(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public static void main(String[] args) {
		List_names la1 = new List_names(25, "kiran");
		List_names la2 = new List_names(19, "siddharth");
		List_names la3 = new List_names(18, "anna");
		List_names la4 = new List_names(28, "gaurav");
		
		List<List_names> l = new ArrayList<List_names>();
		l.add(la1);
		l.add(la2);
		l.add(la3);
		l.add(la4);
		
//		Using foreach loop
//		for (List_names i : l) {
//			if (i.getAge()>20) {
//				System.out.println(i.getName());
//			}
//		}
		
//		Using Stream API
		l.stream().filter(i -> i.getAge()>20).map(List_names::getName).collect(Collectors.toList()).forEach(System.out::println);
	}
}
