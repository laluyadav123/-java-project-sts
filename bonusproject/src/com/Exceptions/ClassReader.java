package com.Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ClassReader {

	public static void main(String[] args) throws IOException {
		
		FileReader file = new 	FileReader("/Users/laluyadav/Desktop/File");
		BufferedReader bufferedReader = new BufferedReader(file);
		String readLine =bufferedReader.readLine();
		System.out.println(readLine);

	}

}
