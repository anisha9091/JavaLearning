package com.java.learning.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// set,list,queue
public class ArrayListDemo {
	public static void main(String[] args) {
		// List<String> arrayList = new ArrayList<String>();
		// List<String> list = new LinkedList<String>();
		// Set<String> list = new HashSet<String>();
		// Set<String> list = new LinkedHashSet<String>();
		Set<String> list = new TreeSet<String>();
		list.add("Gourav");
		list.add("Gourav");
		list.add("Loves");
		list.add("Loves");
		list.add("Anisha");
		list.add("Anisha");

		// iterator
		// foreach
		System.out.println("For Each");
		for (String element : list) {
			System.out.println(element);
		}

		System.out.println("Iterator");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
	}
}
