package com.comparator;

import java.util.Comparator;
 
public class Roll_comparator implements Comparator<Comparator_class> {

	@Override
	public int compare(Comparator_class o1, Comparator_class o2) {
		if (o1.getRollno() < o2.getRollno())
			return -1;
		else if (o1.getRollno() > o2.getRollno())
			return 1;
		else
			return 0;
	}

}
