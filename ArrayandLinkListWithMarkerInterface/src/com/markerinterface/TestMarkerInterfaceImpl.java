package com.markerinterface;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class TestMarkerInterfaceImpl {

	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		LinkedList linkedList=new LinkedList();
		
		System.out.println("arrayList instanceof Serializable ::"+ (arrayList instanceof Serializable));
		System.out.println("LikedList instanceof Serializable ::"+(linkedList instanceof Serializable));
		
		System.out.println("arrayList instanceof Cloneable ::"+(arrayList instanceof Cloneable));
		System.out.println("LinkedList instanceof Cloneable ::"+ (linkedList instanceof Cloneable));
		
		System.out.println("arrayList instanceof RandomAccess::"+ (arrayList instanceof RandomAccess));
		System.out.println("linkedList instanceof RandomAccess::"+(linkedList instanceof RandomAccess)); //Linked List not implemeted RandomAccess
	}
}
