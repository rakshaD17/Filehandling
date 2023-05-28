package com.jspiders.filehandling.write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class charReadDemo {
	public static void main(String[] args)  {
		File file = new File("charStream.txt");
		if (file.exists()) {
			FileReader fileReader;
			try {
				fileReader = new FileReader(file);
				System.out.println("Reading data from file");
				System.out.println("readoutput:"+fileReader.read());
				fileReader.close();
				Scanner scanner = new Scanner(file);
				while (scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				}
			scanner.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("file does not exists");
		}
	}
}
