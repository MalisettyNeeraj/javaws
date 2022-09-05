package in.co.hsbc.fourthpro.interf;

public class Dog  extends Animal implements Pet{

	@Override
	public void makeSound() {
		System.out.println("woof..woof");
	}
	@Override
	public void play() {
		System.out.println("playing....");
		
	}
}
