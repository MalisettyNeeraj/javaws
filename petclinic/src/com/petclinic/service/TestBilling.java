package com.petclinic.service;

public class TestBilling {
	
	public static void main(String[] args) {
		
		
		CartService cs = new CartServicePersist();
		MyStore mystore = new MyStore();
		mystore.billingCounter(cs);
		
	}

}
