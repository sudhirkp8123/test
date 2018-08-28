package com.java.examplejava8;

public class LamdaExpression {

	public static void main(String[] args) {
		Transaction trans = (int amount) -> {
			System.out.println("Withdrawn amount: "+amount);
		};
		trans.withDraw(1300);
	}

}
