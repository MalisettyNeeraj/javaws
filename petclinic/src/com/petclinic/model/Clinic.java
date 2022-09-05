package com.petclinic.model;

public class Clinic {
	
	
	public void vaxDog(Dog d ) {
		System.out.println("Prepare...");
		d.vaccinate();
		System.out.println("Over...");
		
	}


	public void vaxCat(Cat c ) {
		System.out.println("Prepare...");
		c.vaccinate();
		System.out.println("Over...");
		
	}
}
