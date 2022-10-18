package com.javaproject;

public class Main {

	public static void main(String[] args) {
		
		JavaIntern javaIntern = new JavaIntern();
		javaIntern.setId(201);
		javaIntern.setName("Lalu");
		javaIntern.setSalary(25000);
		javaIntern.addBonus();
		System.out.println(javaIntern);

	}

}
