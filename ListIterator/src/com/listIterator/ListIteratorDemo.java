package com.listIterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList();
		linkedList.add("avanish");
		linkedList.add("ramu");
		linkedList.add("aanshu");
		linkedList.add("raju");
		
		ListIterator listIterator=linkedList.listIterator();
		while(listIterator.hasNext()) {
			String name=(String)listIterator.next();
			if(name.equalsIgnoreCase("avanish")) {
				listIterator.remove();
			}
		}
		System.out.println(linkedList);
	}
}
