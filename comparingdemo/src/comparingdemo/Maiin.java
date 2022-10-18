package comparingdemo;

import java.util.Comparator;

public class Maiin {

	public static void main(String[] args) {
		
		Student s =new Student(101,"Lalu", 70);
		Student s1 =new Student(102,"Lalit", 80);
		
		//Comparator c =new Comparator();
		Comparator<Student> camp = (x,y)->(x.getMarks().compareTo(y.getMarks()));
		
	System.out.println(camp.compare(s, s1));
		
	//	System.out.println(s.compareTo(s1));

	}

}
