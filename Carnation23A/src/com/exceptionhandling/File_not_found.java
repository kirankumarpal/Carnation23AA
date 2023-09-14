package com.exceptionhandling;

import java.io.*;
import java.util.*;

public class File_not_found {

	public static void readFile(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner scanner = new Scanner(file);

		// Read and process the contents of the file
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(line);
		}
		scanner.close();
	}

	public static void main(String[] args) {
		try {
			readFile("\"E:\\Docs\\193800039_ExamForm21.PDF\"");
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
