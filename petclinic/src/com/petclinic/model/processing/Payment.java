package com.petclinic.model.processing;

public abstract class Payment {
	private double amount;
	
	public abstract void pay();

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
