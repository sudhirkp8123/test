package com.java.number;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter number: ");
		int n= new Scanner(System.in).nextInt();
		fact(n);
		System.out.println(fact1(n));
	}

	private static void fact(int n) {
		int result=1;
		for(int i=1; i<=n; i++){
			result=result*i;
		}
		System.out.println("Factorial for "+n +" is "+result);
		
	}
	
	private static int fact1(int num){
		if(num==0){
			return 1;
		} else {
			return (num*fact1(num-1));
		}
	}

}
