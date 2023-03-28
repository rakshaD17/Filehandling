package com.jspiders.filehandling.create;

import java.io.File;
import java.io.IOException;

public class createfileDemo3 {
	public static void main(String[] args) {
		File file=new File("D:/WEJE3/Hello.txt");
				
			if(file.exists())
			{
				System.out.println("File already exists");
			}
			else
			{
				try {
					file.createNewFile();
					System.out.println("file created");
				} catch (IOException e) {
					System.out.println("file not created");
					e.printStackTrace();
				}
			}
	}

}
