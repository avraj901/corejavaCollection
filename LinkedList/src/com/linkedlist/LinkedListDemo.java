package com.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList();
		System.out.println(linkedList.size());
		linkedList.add("avanish");
		linkedList.add(30);
		linkedList.add("avanish");
		linkedList.add(null);
		System.out.println("linkedList"+linkedList);
		linkedList.set(0, "software");
		System.out.println(linkedList);
		linkedList.removeLast();
		System.out.println(linkedList);
		linkedList.addFirst("ram");
		System.out.println(linkedList);
	}
}
