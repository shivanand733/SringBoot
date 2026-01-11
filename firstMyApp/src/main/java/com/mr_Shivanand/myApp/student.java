package com.mr_Shivanand.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class student {
	
	@Autowired
	drive dr;
	public void greet() {
		dr.bike();
		System.out.println("Well Come to all... Springboot Session");
	}
}
