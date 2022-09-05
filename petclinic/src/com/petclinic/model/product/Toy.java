package com.petclinic.model.product;

public class Toy extends Product {
	private String leadcontent;
	private String agegroup;
	
	public  Toy(String id,String agegroup) {
		super(id);
		this.agegroup=agegroup;
		
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
