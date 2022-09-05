package com.petclinic.service;

public class CartServicePersist extends CartService {

	@Override
	public void addToCart() {
		super.addToCart();
		System.out.println("updating db...");
	}
}
