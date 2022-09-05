package com.petclinic.model;

public class TestStore {

	
	public static void main(String[] args) {
		
		Store s = new Store();
		
		UPI upi = new UPI("123");
		s.processPayment(upi);
		
		CreditCard cc = new CreditCard("1234");
		s.processPayment(cc);
		
		
		
	}
}
