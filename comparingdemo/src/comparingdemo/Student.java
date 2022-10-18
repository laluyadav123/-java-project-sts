package comparingdemo;

public class Student implements Comparable<Student>{
	
	private int id;
	private String name;
	private Integer marks;
	
	
	public Student(int id, String name, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.marks = salary;
	}
	
	


	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
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
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}


	@Override
	public int compareTo(Student o) {
		return this.marks.compareTo(o.marks);
	}
	
	

}
