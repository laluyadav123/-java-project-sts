package EMployeProject;

public class Employe implements Bonus{
	
	private String name;
	private int salary;
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int addbonus() {
		
		this.salary=this.salary+bonus;
		return this.salary;
		
	}


	@Override
	public String toString() {
		return "Employe [name=" + name + ", salary=" + salary + "]";
	}
	
	

}
