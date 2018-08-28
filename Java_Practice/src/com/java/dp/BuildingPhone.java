package com.java.dp;

/**
 * @author Sudhir Kumar
 * @version 1.0
 * 
 * If you want to customize the object while creating you can use Builder design Pattern.
 *
 */
public class BuildingPhone {

	public static void main(String[] args) {
		Phone phone = new PhoneBuilder().setOs("Andriod 4.0")
				.setProcessor("Qualcom").buildPhone();
		System.out.println(phone);
	}
}
