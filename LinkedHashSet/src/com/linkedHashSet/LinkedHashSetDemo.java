package com.linkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet linkedHashSet = new LinkedHashSet();
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		linkedHashSet.add("D");
		linkedHashSet.add("E");
		linkedHashSet.add(null);
		System.out.println(linkedHashSet); //insertion ordered preserved
		System.out.println(linkedHashSet.add("E"));
		System.out.println(linkedHashSet);
	}
}
