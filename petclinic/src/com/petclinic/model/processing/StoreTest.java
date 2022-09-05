package com.petclinic.model.processing;

public class StoreTest {
	
	public static void main(String[] args) {
		
		Store s = new Store();
		Payment p = new UPI();

	
		s.processPayment(p);
		
		CreditCard cc = new CreditCard();
		s.processPayment(cc);
		
	
		
	}

}
