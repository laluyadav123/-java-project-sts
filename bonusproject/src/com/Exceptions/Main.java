package com.Exceptions;

public class Main {

	public static void main(String[] args){
		/*try {
		ExceptionClass e= getEmp();
		int i=10/0;
		e.print();
		}catch (Exception e) {
		
		}
		
		System.out.println("null pointer exception");
		
		System.out.println("any other exception");
		
		
		System.out.println("any other exception");
		
		
			
		}*/
		
		System.out.println(print());
	
	}

	private static int print() {
		try {
		int x=10/0;
		return 1;
		}catch (Exception e) {
			return 2;
		}finally {
			return 3;
		}

	
	}

}
