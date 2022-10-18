package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("LALU");
		list.add("AKARSH");
		list.add("MANISH");
		list.add("LALIT");
		
		
		List<String> name =list.stream().filter((e)->(e.equals("LALU"))).collect(Collectors.toList());
		
		System.out.println(name);

	}

}
