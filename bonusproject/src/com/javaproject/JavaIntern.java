package com.javaproject;

public class JavaIntern extends Intern implements DiwaliBonus {

	@Override
	public void addBonus() {
		
		super.setSalary(bonus+super.getSalary());
		
	}

	@Override
	public String toString() {
		return "JavaIntern [getName()=" + getName() + ", getId()=" + getId() + ", getSalary()=" + getSalary()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
