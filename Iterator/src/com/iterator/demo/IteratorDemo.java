package com.iterator.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList arrayList=new ArrayList();
		for(int i=0;i<10; i++) {
			arrayList.add(i);
		}
		Iterator iterator=arrayList.iterator();
		while(iterator.hasNext()) {
			Integer i=(Integer)iterator.next();
			if(i%2==0) {
			System.out.println(i);
			System.out.println("------------------------");
		}
			else {
				iterator.remove();
			}	
		}
		System.out.println(arrayList);
	}
}
