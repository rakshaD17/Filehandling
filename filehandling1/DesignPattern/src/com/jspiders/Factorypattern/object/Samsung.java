package com.jspiders.Factorypattern.object;

import com.jspiders.Factorypattern.inter.Browser;

public class Samsung implements Browser{

	@Override
	public void start() {
		System.out.println("Samsung browser started");
		
	}

}
