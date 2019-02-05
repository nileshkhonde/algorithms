package com.algorithms.stack;

public class Stack {
	private int[] a ;
	private int topOfStack;
	
	public Stack(int size) {
		a = new int[size];
		topOfStack = -1;
	}
	
	public void push(int val) {
		if(topOfStack < a.length-1) {
			a[++topOfStack] = val;
		}else {
			System.out.println("Stack is full !");
		}
	}
	
	public int pop() {
		if(topOfStack <0) {
			System.out.println("Stack is Empty !");
			return -1;
		}else {
			return a[topOfStack--];
		}
	}
	
	public boolean isEmpty() {
		if(topOfStack <0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int peek() {
		if(topOfStack >=0) {
			return a[topOfStack];
		}else {
			System.err.println("Stack is empty!");
			return -1;
		}
	}
}
