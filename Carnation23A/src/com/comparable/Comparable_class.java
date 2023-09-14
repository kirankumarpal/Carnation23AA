package com.comparable;

/**
 * Defn: It gives the ability to compare on the basis of objects or variables in
 * ascending or descending order.
 */

public class Comparable_class implements Comparable<Comparable_class> {
	private String name;
	private int rollno;
	private float marks;

	public Comparable_class(String name, int rollno, float marks) {
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}

	@Override
	public int compareTo(Comparable_class s) {
		if (this.marks < s.marks)
			return -1;
		else if (this.marks > s.marks)
			return 1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return ""+ marks;
	}
}
