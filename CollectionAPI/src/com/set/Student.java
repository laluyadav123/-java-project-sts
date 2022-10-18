package com.set;

public class Student {
	
	
	private String name;
	private int marks;
	
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;*/
		Student other = (Student) obj;
		//return marks == other.marks && Objects.equals(name, other.name);
		return this.name.equals(obj);
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	

}
