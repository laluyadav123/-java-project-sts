package com.set;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		Student s = new Student("lalu",100);
		Student s1 = new Student("lalu",90);
		//Student s2 = new Student("baniya",80);
		
		Set<Student> set = new HashSet<>();
		set.add(s);
		set.add(s1);
	//	set.add(s2);
		 
		System.out.println(set);
	}

}
