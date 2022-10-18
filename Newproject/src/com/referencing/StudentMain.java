package com.referencing;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s= new Student(101, 20000);
		Bonus b=s::bonuscal;
		b.addBonus();
		
		
		Bonus b1= Student::add;
		b1.addBonus();
	
		
		Bonus b2= Student::new;
		b2.addBonus();
		System.out.println(s);

	}

}
