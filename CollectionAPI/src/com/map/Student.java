package com.map;

public class Student {


	private int id;
	private String name;
	private int marks;
	
	public Student(int id, String name,int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ",marks=" + marks + "]";
	}

	
	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id ;
	}
	
	

}
