package com.prepro;

public class Toy extends Product {

	
	
	private String leadcontent;
	private String agegroup;
	
	

	public Toy(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}
	
	public Toy(String code, String leadcontent, String agegroup) {
		super(code);
		this.leadcontent = leadcontent;
		this.agegroup = agegroup;
	}

	public String getLeadcontent() {
		return leadcontent;
	}
	public void setLeadcontent(String leadcontent) {
		this.leadcontent = leadcontent;
	}
	public String getAgegroup() {
		return agegroup;
	}
	public void setAgegroup(String agegroup) {
		this.agegroup = agegroup;
	}
	
}
