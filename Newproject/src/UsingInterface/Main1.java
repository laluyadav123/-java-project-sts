package UsingInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main1 {

	public static void main(String[] args) {
		
		
		Employee emp =new Employee("Lalu", 40);
		Employee emp1 =new Employee("Aryan", 20);
		Employee emp2 =new Employee("Akarsh", 30);
		
		
		List<Employee> list =new ArrayList<>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		
		Set<Employee> newset=list.stream().collect(Collectors.toSet());
		System.out.println(newset);
//		Set<Employee> copyList = new LinkedHashSet<>();
//		copyList.add(emp);
//		copyList.add(emp1);
//		copyList.add(emp2);
//		
//		System.out.println(copyList);
		
		
		//Collections.sort(list,(x,y)->x.getSalary()-y.getSalary());
	   
		
		//System.out.println(Collections.max(list,(x,y)->x.getSalary()-y.getSalary()));
	
		//Collections.sort(list,Collections.reverseOrder());
		//System.out.println(list);
	}

}
