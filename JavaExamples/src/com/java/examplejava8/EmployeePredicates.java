package com.java.examplejava8;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicates {

	public static Predicate<Employee> isAdultMale(){
		return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
	}
	
	public static Predicate<Employee> isAdultFemale(){
		return p -> p.getAge() >21 && p.getGender().equalsIgnoreCase("F");
	}
	
	public static List<Employee> filterEmployees (List<Employee> employees, Predicate<Employee> predicate) {
        return employees.stream().filter( predicate ).collect(Collectors.<Employee>toList());
    }
}
