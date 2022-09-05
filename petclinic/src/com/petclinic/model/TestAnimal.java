package com.petclinic.model;

public class TestAnimal {
	
	
	public static void main(String[] args) {
		
		Clinic cl = new Clinic();
		
		Dog d = new Dog();
		
		cl.vaxDog(d);
		
		Cat c = new Cat();
		
		cl.vaxCat(c);
		
		
	
	}

}
