package com.petclinic.model.processing;

public class CreditCard extends Payment {

	private String ccno;
	
	public String getCcno() {
		return ccno;
	}

	public void setCcno(String ccno) {
		this.ccno = ccno;
	}

	@Override
	public void pay() {
		System.out.println("paying thru ...creditcard");
	}
}
