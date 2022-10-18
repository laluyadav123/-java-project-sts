package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<>();
		list.add("Lalu");
		list.add("Akarsh");
		list.add("Lalit");
		list.add("Lalit");
		list.add("Rishab");
		
		list.remove("Lalit");
	
		
		System.out.println(list);
		
		boolean contains = list.contains("Lalit");
		System.out.println("Check the given element is there or not :"+contains);
		
		System.out.println("Finding the elemete at perticuler index :"+list.get(3));

		List<String> copylist =new ArrayList<>(list);
		 copylist.add(null);
	
		
		 copylist.addAll(list);
		 
		 
			System.out.println("add one list to another" +copylist);
	}

}
