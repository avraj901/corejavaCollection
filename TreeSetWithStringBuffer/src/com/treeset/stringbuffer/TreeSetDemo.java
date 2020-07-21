package com.treeset.stringbuffer;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet treeSet= new TreeSet();
		treeSet.add(new StringBuffer("A"));        //classcastException
		treeSet.add(new StringBuffer("C"));         //StringBuffer does not implement ComprableInterface
		treeSet.add(new StringBuffer("B"));
		System.out.println(treeSet);
		
	}
}
