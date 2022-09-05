package com.petclinic.model.product;

public class TestProductToy {
	
	public static void main(String[] args) {
		
		Toy t = new Toy("T101","8Y");
		t.setName("Car");
		t.setLeadcontent("0.001");
		System.out.println(t.getId());
		
	}

}
