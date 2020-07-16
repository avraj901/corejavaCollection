package com.arraylist;

public class ArrayTest {

	public static void main(String[] args) {
		
		Student[] student = new Student[10000];
		System.out.println("Student --->"+student);
		student[0] = new Student();
		student[0] =new Customer();  //Compile time Error 
	}
}
