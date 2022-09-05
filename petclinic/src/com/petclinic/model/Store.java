package com.petclinic.model;

public class Store {
	
	
	public void processPayment(CreditCard cc) {
		
		System.out.println("processing card+ " + cc.getCcno());
	}
	

	public void processPayment(UPI upi) {
		
		System.out.println("processing upi+ " + upi.getId());
	}

}
