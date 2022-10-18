package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Lalu");
		list.add("Lalit");
		list.add("Gaurav");
		list.add("Akarsh");
		System.out.println(list);
		list.add(2,"Anubhav");
		System.out.println("Inerting a node at the perticuler Index");
		System.out.println(list);
		
		List<String> copyList = new ArrayList<>(list);
		System.out.println(copyList);
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
	}

}
