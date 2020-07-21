package com.hashset.Demo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hashSet=new HashSet();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add(null);
		System.out.println(hashSet);     //insertion order not preserved.
		System.out.println(hashSet.add(null)); //duplicate are not allowed.
		System.out.println(hashSet);
	}
}
