package com.prepro;

public class Employee extends Person {
	
	private String designation;

	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
		this.fname="";
	}
	
	
	

}
