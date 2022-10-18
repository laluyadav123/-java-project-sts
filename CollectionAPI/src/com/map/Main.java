package com.map;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Student e1 = new Student(101,"Aryan", 90);
		Student e2 = new Student(102,"Akarsh",70);
		Student e3 = new Student(103,"Lalit",89);
		Student e4 = new Student(104,"Lalu",98);
		Student e5 = new Student(105,"Gaurav",100);
		

		Map<Student, String> map = new HashMap<>();
		map.put(e1,"dps" );
		map.put(e2,"svm" );
		map.put(e3,"covnt" );
		map.put(e4,"rnd" );
		map.put(e5,"gniot");
	
		
		System.out.println(map);
	}

}
