package com.petclinic.model.processing;

public class UPI extends Payment{
	
	private String upiId;

	@Override
	public void pay() {
		System.out.println("paying thru UPI...");
		
	}

	public String getUpiId() {
		return upiId;
	}

	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}

}
