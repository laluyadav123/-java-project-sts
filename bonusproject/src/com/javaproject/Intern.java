package com.javaproject;

public abstract class Intern {
	
	
	private String name;
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
		private int id;
	private int salary;
	
	
	public abstract void addBonus();
		
	
	

}
