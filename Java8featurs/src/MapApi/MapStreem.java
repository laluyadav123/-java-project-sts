package MapApi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapStreem {
	
	public static void main(String[] args) {
		
		Map<String, Integer> hmap = new HashMap<>();
		hmap.put("Lalu", 121);
		hmap.put("Aryan", 212);
		
		Set<String> keySet = hmap.keySet();
		System.out.println(keySet);
		
		List<String> list =keySet.stream().filter(e->e.equals("Lalu")).collect(Collectors.toList());
		
		System.out.println(list);
	}

}
