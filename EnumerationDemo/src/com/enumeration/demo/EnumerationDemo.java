package com.enumeration.demo;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		
		Vector vector=new Vector();
		for(int i=0;i<10;i++) {
			vector.add(i);
		}
		Enumeration enumeration=vector.elements();
		while(enumeration.hasMoreElements()) {
			Integer i=(Integer)enumeration.nextElement();
			System.out.println(i);
			System.out.println("--------------------");
				
			
		}
	}
}
