package com.java.pattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No of rows, you want to print");
		int noOfRows = sc.nextInt();

		int rowCount = 1;

		System.out.println("Here is your pyramid");

		// logic for creating pyramid.
		for (int i = noOfRows; i > 0; i--) {

			// Printing i spaces at the beginning of each row
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			// Printing 'rowCount' value 'rowCount' times at the end of each row
			for (int j = 1; j <= rowCount; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();

			// Incrementing the rowCount
			rowCount++;
		}
	}
}
