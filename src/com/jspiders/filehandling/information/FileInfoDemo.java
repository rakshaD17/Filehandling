package com.jspiders.filehandling.information;

import java.io.File;
import java.io.IOException;

public class FileInfoDemo {
		public static void main(String[] args) {
			File file = new File("hello.txt");
			if(file.exists()) {
			    System.out.println("file already exists");
			}else {
				try {
					file.createNewFile();
					System.out.println("file already created");
				} catch (IOException e) {
					System.out.println("File not Created");
					e.printStackTrace();
				}
			}
			
	System.out.println("Name of the file:"+file.getName());
	System.out.println("Path of the file:"+file.getAbsolutePath());
	System.out.println("Length of the file:"+file.length());
	if (file.canRead()) {
		System.out.println("file is readable");
	}else {
		System.out.println("The file is not readable");
	}
	if (file.canWrite()) {
		System.out.println("The file is writable");
	} else {
		System.out.println("The file is not writable");
	}
	if (file.canExecute()) {
		System.out.println("The file is Executable");		
	} else {
		System.out.println("The file is not Executable");
	}
		}
}
