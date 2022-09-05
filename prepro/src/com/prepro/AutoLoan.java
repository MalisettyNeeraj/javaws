package com.prepro;

public class AutoLoan extends Loan {

	private double interest;

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	public double calulate() {
		return (getInterest() /100) * getLoanamount();
	}
	
	
}
