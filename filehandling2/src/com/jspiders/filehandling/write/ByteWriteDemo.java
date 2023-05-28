package com.jspiders.filehandling.write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWriteDemo {
	public static void main(String[] args) {
		try {
		File file = new File("ByteStream.txt");
		if (file.exists()) {
			System.out.println("File alraedy Exists");
		} else {
			file.createNewFile();
			System.out.println("File created");
			}
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		fileOutputStream.write(40);
		System.out.println("Data Written to a file");
		fileOutputStream.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		}
	}
