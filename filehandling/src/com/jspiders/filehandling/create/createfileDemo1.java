package com.jspiders.filehandling.create;

import java.io.File;
import java.io.IOException;

public class createfileDemo1 {
		public static void main(String[] args) {
				File file=new File("Hello.txt");
				
				try {
					file.createNewFile();
					System.out.println("craete new file");
				} catch (IOException e) {
					System.out.println("file not found");
					e.printStackTrace();
				}
				
		}
}
