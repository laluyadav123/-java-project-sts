package EMployeProject;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

	
		Employe e = new Employe();
		e.setName("Lalu");
		e.setSalary(15000);
		Employe e1 = new Employe();
		e1.setName("Aryan");
		e1.setSalary(25000);
		Employe e2 = new Employe();
		e2.setName("Gaurav");
		e2.setSalary(30000);
		Employe e3 = new Employe();
		e3.setName("Akarsh");
		e3.setSalary(20000);
		Employe e4 = new Employe();
		e4.setName("Lalit");
		e4.setSalary(10000);
		
		List<Employe> list =new LinkedList<>();
		list.add(e);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
           //     list.stream().filter((x)->(x.getSalary()<20000)).forEach(x->x.setSalary(x.getSalary()+1000));//here we use the foreach and change the setsalary and geting it with bonus
		
		System.out.println("salary less then 200000 :"+list);
		
	
		
//		List<Integer> list2 = list.stream().filter((x)->(x.getSalary()<20000)).map((x)->(x.addbonus())).collect(Collectors.toList());
//		System.out.println("After Bonus Add"+list2);

	}

}
