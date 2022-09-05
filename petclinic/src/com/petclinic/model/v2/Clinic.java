package com.petclinic.model.v2;

public class Clinic {
	
	
	public void vax(Animal a ) {
		System.out.println("Prepare...");
		a.vaccinate();
		System.out.println("Over...");
		
	}

}
