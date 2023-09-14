package com.comparator;

/**
 *	Definition: Third person compares externally another 2 people. 
 */

public class Comparator_class {
	private String name;
	private int rollno;
	private float marks;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public Comparator_class(String name, int rollno, float marks) {
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return name;
	}
}
