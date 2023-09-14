package com.comparator;

import java.util.Comparator;

public class Marks_comparator implements Comparator<Comparator_class> {

	@Override
	public int compare(Comparator_class o1, Comparator_class o2) {
		if (o1.getMarks() < o2.getMarks())
			return -1;
		else if (o1.getMarks() > o2.getMarks())
			return 1;
		else
			return 0;
	}

}
