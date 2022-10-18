package UsingInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(6);
		list.add(7);
		

		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		
		
	}

}
