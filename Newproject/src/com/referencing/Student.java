package com.referencing;

public class Student {

	private int id;
	private int salary;

	public Student(int id, int salary) {
		super();
		this.id = id;
		this.salary = salary;
	}

	
	public Student() {
		System.out.println("inside constructor");
	}
	
	static void add() {
		System.out.println("inside static method");
	}
	public void bonuscal() {
        this.salary= this.salary+1000;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getName() {
		return salary;
	}

	public void setName(int  salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + salary + "]";
	}

}
