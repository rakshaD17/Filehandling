package com.jspiders.filehandling.read;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class charWriteDemo {
		public static void main(String[] args) {
			File file = new File("characterStream.txt");
			if (file.exists()) {
				System.out.println("File already exixts");
			} else {
				try {
					file.createNewFile();
					System.out.println("File is created");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	try {
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write("Data from program");
		System.out.println("Data written file");
		fileWriter.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
}
