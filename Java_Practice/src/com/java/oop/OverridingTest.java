package com.java.oop;

import com.java.collections.Student;

public class OverridingTest extends Student{

	public OverridingTest() {
		super();
	}

	public void test(){
		System.out.println("OverridingTest created");
	}
	public static void main(String[] args) {
		
		Student st = new OverridingTest();
		st.test();
		
		OverridingTest ot = new OverridingTest();
		ot.test();
	}
}
