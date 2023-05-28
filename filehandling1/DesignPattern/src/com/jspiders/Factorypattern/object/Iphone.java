package com.jspiders.Factorypattern.object;

import com.jspiders.Factorypattern.inter.Browser;

public class Iphone implements Browser {

	@Override
	public void start() {
		System.out.println("Iphone browser started");
		
	}

}
