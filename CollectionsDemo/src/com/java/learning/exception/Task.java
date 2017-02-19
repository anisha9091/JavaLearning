package com.java.learning.exception;

import java.io.File;
import java.io.FileInputStream;

public class Task {


	static void readFile() throws Exception{
		File file = new File("Cloze.txt");
		FileInputStream fis = null;

			fis = new FileInputStream(file);

			System.out.println("Total file size to read (in bytes) : " + fis.available());

			int content;
			while ((content = fis.read()) != -1) {
				// convert to char and display it
				System.out.print((char) content);
			}

	}

}
