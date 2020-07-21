package com.treeSet;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet treeSet=new TreeSet();
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("a");
		treeSet.add("Z");
		treeSet.add("L");
		System.out.println(treeSet); //insertion order
		System.out.println(treeSet.add(null)); //null pointer Exception
	}
}
