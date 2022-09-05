package com.prepro;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.setFname("James");
		e.setLname("Bond");
		e.setDesignation("Developer");
		
		System.out.println(e.getFname() + " : " + e.getDesignation());
	}

}
