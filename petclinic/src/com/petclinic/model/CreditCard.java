package com.petclinic.model;

public class CreditCard {
	private String ccno;

	
	public CreditCard(String ccno) {
			this.ccno = ccno;
	}

	public String getCcno() {
		return ccno;
	}

	public void setCcno(String ccno) {
		this.ccno = ccno;
	}


}
