package com.mr_Shivanand.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class student {
	
//	Field Injection
	@Autowired
	drive dr;
	
//	Constructor Injection
//	public student (drive dr) {
//		this.dr = dr;
//	}
	
//	Setter injection
	public void setDr(drive dr) {
		this.dr = dr;
	}
	public void greet() {
		
		System.out.println("Well Come to all... Springboot Session");
		dr.bike();
	}

	
}
