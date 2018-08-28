package com.java.string;

public class StringTest {

	public static void main(String[] args) {
		String str ="strong";
		
		char[] charArray = str.toCharArray();
		for(int i=0; i<str.length(); i++){
			System.out.println(str.substring(i, str.length())+str.substring(0, i));
		}
		
	}

}
