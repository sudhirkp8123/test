package com.java.collections;

import java.util.Arrays;

public class CustomStack1 {

	int size;
	 int arr[];
	 int top;
	 
	 CustomStack1(int size) {
	  this.size = size;
	  this.arr = new int[size];
	  this.top = -1;
	 }
	 
	public int peek() {
		return arr[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

	public void push(int pushedElement) {
		if (!isFull()) {
			top++;
			arr[top] = pushedElement;
			System.out.println("Pushed element:" + pushedElement);
		} else {
			System.out.println("Stack is full !");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped element :" + arr[returnedTop]);
			return arr[returnedTop];

		} else {
			System.out.println("Stack is empty !");
			return -1;
		}
	}
	
	public static void main(String[] args) {
		CustomStack1 stack = new CustomStack1(10);
		stack.pop();
		System.out.println("=================");
		stack.push(10);
		stack.push(30);
		stack.push(50);
		stack.push(40);
		System.out.println("=================");
		System.out.println("Peek Element:"+stack.peek());
		stack.pop();
		System.out.println("Peek Element:"+stack.peek());
		stack.pop();
		System.out.println("Peek Element:"+stack.peek());
		stack.pop();
		System.out.println("=================");

	}
}
