package com.association;

public class Main {

	public static void main(String[] args) {
		
		//Composition(Tightly cupled)
		Car c = new Car(111,new Driver("Mukesh"));
		System.out.println(c);
		
		//Aggrigation(Loosly cupled)
		/*Car c = new Car(111);
		System.out.println(c);
*/
	}

}
