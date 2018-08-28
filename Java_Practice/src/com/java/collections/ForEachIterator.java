package com.java.collections;

import java.util.LinkedList;
import java.util.List;

public class ForEachIterator {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		for(Integer i : list){
			list.add(5);
			System.out.println(i);
		}
	}
}