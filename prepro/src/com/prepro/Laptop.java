package com.prepro;

public class Laptop  extends Product {
	
	private String processor;
	private String model;
	
		public Laptop(String code, String processor, String model) {
		super(code);
		this.processor = processor;
		this.model = model;
	}

	public Laptop(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	

}
