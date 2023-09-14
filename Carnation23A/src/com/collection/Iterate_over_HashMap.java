package com.collection;

/**
 * There are 4 ways to iterate over a HashMap
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Iterate_over_HashMap {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");

		System.out.println("========== First Way ==========");
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		while (itr.hasNext()) {
			System.out.println(map.get(itr.next()));
		}

		System.out.println("========== Second Way ==========");
		Set<Entry> enteries2 = map.entrySet();
		Iterator<Entry> en = enteries2.iterator();
		while (en.hasNext()) {
			Entry e = en.next();
			System.out.println(e.getKey() + " = " + e.getValue());
		}
 
 		System.out.println("========== Third Way ==========");
		Set keys1 = map.keySet();
		for (Object key : keys1) {
			System.out.println(key + " = " + map.get(key));
		}

		System.out.println("========== Fouth Way ==========");
		Set<Entry> enteries = map.entrySet();
		for (Entry entry : enteries) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
			System.out.println(entry);
		}

		System.out.println("========== Fifth Way ==========");
		Set enteries1 = map.entrySet();
		for (Object entry1 : enteries1) {
			System.out.println(entry1);
		}
	}
}
