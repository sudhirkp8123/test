package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class C implements A, B {

	public final static int MAX = 300;
	
	public static void main(String[] args) {
		A a = new C();
		System.out.println(MAX); //Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		                         // The field MAX is ambiguous
	}
	
}
