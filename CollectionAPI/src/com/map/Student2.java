package com.map;

public class Student2 {
	
	private String name;
	private Integer marks;
	
	public Student2(String name, Integer marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getMarks() {
		return marks;
	}



	public void setMarks(Integer marks) {
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "Student2 [name=" + name + ", marks=" + marks + "]";
	}
	
	

}
