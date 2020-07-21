package com.array.methods;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
      ArrayList arrayList=new ArrayList();
      arrayList.add("A");
      arrayList.add(10);
      arrayList.add("A");      //Duplicate 
      arrayList.add(null);     //null is added
      System.out.println("arrayList" + arrayList); //insertion order preserved
      arrayList.remove(2);
      System.out.println("arrayList After Removing :" +arrayList);
      arrayList.add(2, "m");
      System.out.println("In arrayList adding value at index 2 : "+ arrayList);
      arrayList.add("n");
      System.out.println("Added n :"+ arrayList);
      System.out.println(arrayList.contains("n"));  //contains method
      System.out.println(arrayList.get(2));         //getIndex method
      System.out.println(arrayList.getClass());     //getClass method
      System.out.println(arrayList.hashCode());     //hashCode method
      System.out.println(arrayList.indexOf("A"));   //indexOf method
      System.out.println(arrayList.isEmpty());      //isEmpty method
      System.out.println(arrayList.lastIndexOf("A")); //lastIndexOf method
      System.out.println(arrayList.size());           //size method
      System.out.println(arrayList.set(3, "Avanish")); //set Method
      System.out.println(arrayList);
	}
}
