package com.prepro;

public class TestLoan {
	
	public static void main(String[] args) {
		
		AutoLoan loan = new AutoLoan();
		loan.setLoanamount(1000);
		loan.setInterest(7.0);
		System.out.println(loan.calulate());
	}

}
