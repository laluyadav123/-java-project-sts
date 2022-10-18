package Player;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		Player p = new Player("Lalu", 80);
		Player p1 = new Player("Rishab", 400);
		Player p2 = new Player("Akarsh", 60);
		Player p3 = new Player("Gaurav", 90);
		Player p4 = new Player("Lalit", 10);
		
		
		
		Set<Player> st = new TreeSet<>();//sorting without stream and with treeset
		
		///Player st2 = st.stream().max((x,y)->(x.score-y.score)).get();
	
		st.add(p);
		st.add(p1);
		st.add(p2);
		st.add(p3);
		st.add(p4);
		
	//	Player st2 = st.stream().max((x,y)->x.score-y.score).get();
		System.out.println(st);
		
		
	System.out.println();
	
		
		
		Set<Player> set = new TreeSet<>((x,y)-> (y.score-x.score));//sorting without stream and with treeset
		
		
		set.add(p);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		int st2 = set.stream().max((x,y)->(x.score-y.score)).get().score;
		
	System.out.println(st2);
	
	
	   Set<Player> set1 = new HashSet<>(); //sorting without stream and with treeset
	
	    set1.add(p);
	    set1.add(p1);
	    set1.add(p2);
	    set1.add(p3);
	    set1.add(p4);
	
		
		List<Player> set2= set1.stream().sorted((x,y)->(y.score - x.score)).collect(Collectors.toList());
		
		
				System.out.println(set2);
				
			List<Player> set3= set1.stream().sorted((x,y)->(x.score - y.score)).collect(Collectors.toList());
				
				
			System.out.println(set3);
	
	}

}
