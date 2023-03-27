package net.harunote.collection;

import java.util.LinkedHashSet;
import java.util.Set;

class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<String> linkHashSet = new LinkedHashSet<String>();
		linkHashSet.add("B");
		linkHashSet.add("A");
		linkHashSet.add("D");
		linkHashSet.add("E");
		linkHashSet.add("C");
		linkHashSet.add("F");
		System.out.println(linkHashSet);
	}
}