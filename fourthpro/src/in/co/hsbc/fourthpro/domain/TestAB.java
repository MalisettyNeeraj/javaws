package in.co.hsbc.fourthpro.domain;import javax.management.InstanceAlreadyExistsException;

public class TestAB {
	
	
	public static void main(String[] args) {
		
		A a ;
		
		a = new A();
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		
		a.m1();
	}

}
