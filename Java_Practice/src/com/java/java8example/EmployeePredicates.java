package com.java.java8example;

import java.util.function.Predicate;

public class EmployeePredicates {

	public static Predicate<Employee> isAdultMale(){
		return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
	}
}
