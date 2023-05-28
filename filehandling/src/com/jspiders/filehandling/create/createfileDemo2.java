package com.jspiders.filehandling.create;

import java.io.File;
import java.io.IOException;

public class createfileDemo2 {
		public static void main(String[] args) {
			File file=new File("Hello.txt");
			
			if(file.exists()) {
				System.out.println("file already exists");
			}
			else {
			try {
				file.createNewFile();
				System.out.println("file created");
			} catch (IOException e) {
				System.out.println("File not created");
				e.printStackTrace();
			}
			}
		}
}
