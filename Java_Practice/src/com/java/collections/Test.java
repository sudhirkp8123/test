package com.java.collections;

public class Test {

	public static void main(String[] args) {
		char a = (char) 97;
		System.out.println(Character.toUpperCase(a));
		
		Integer x=127;
		Integer y=127;
		System.out.println(x==y);
		
		Integer x1=128;
		Integer y1=128;
		System.out.println(x1==y1);
		
		Integer x2=-129;
		Integer y2=-129;
		System.out.println(x2==y2);
		
		Integer x3=-128;
		Integer y3=-128;
		System.out.println(x3==y3);
	}
}
