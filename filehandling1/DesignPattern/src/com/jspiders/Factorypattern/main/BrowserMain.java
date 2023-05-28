package com.jspiders.Factorypattern.main;

import java.util.Scanner;

import com.jspiders.Factorypattern.Chrome.Chrome;
import com.jspiders.Factorypattern.Edge.Edge;
import com.jspiders.Factorypattern.Firefox.Firefox;
import com.jspiders.Factorypattern.Safari.Safari;
import com.jspiders.Factorypattern.inter.Browser;

public class BrowserMain {
		private static boolean loop=true;
		private static Scanner scanner;
		private static Browser browser;
		
		public static void main(String[] agrs)
		{
			while(loop) {
				
			}
			scanner.close();
		}
		public static Browser factory()
		{
			System.out.println("Selected Browser"+"\n1.Chrome"+"\n1.Firefox"+"\n1.Safari"+"\n1.Edge");
			
			scanner=new Scanner(System.in);
			int choice =scanner.nextInt();
			
			switch(choice)
			{
				case 1:
					browser=new Chrome();
					return browser;
				case 2:
					browser=new Firefox ();
					return browser;
				case 3:
					browser=new Safari();
					return browser;
				case 4:
					browser=new Edge();
					return browser;
				case 5:
					loop=false;
					System.out.println("Invalid Choice");
					return null
			}
			
		}
		
}
