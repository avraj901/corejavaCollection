package com.objectarray;

public class ObjectArrayTest {

	public static void main(String[] args) {
		Object[] object=new Object[1000];
		object[0] = new Student();
		object[1] = new Customer();
	}
}
