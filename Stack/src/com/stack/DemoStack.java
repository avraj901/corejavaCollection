package com.stack;

import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		Stack stack =new Stack();
		stack.add("avanish");
		stack.add("Ramu");
		stack.add("aanshu");
		System.out.println("Stack ::"+stack);
		stack.push("mohn");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.search("avanish")); //observe output 3 why
		System.out.println(stack.search("Z"));
		System.out.println(stack.empty());
		
	}
}
