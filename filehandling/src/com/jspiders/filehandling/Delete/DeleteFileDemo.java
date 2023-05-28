package com.jspiders.filehandling.Delete;

import java.io.File;

public class DeleteFileDemo {
		public static void main(String[] args) {
			File file = new File("Hello.txt");
			if (file.exists()) {
				file.delete();
				System.out.println("File is Deleted");
			} else {
				System.out.println("File does not exists");
			}
		}
}
