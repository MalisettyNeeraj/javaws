package in.co.hsbc.secondpro;

public class ToyTest2 {

	
	public static void main(String[] args) {
		Toy t =  new Toy();
		t.setCode("123");
		t.setName("Car");
		t.setAgegroup("8Y");
		
		Toy s = t;
		System.out.println(t.getName());
		System.out.println(s.getName());
		
		s.setName("Truck Toy");
		
		System.out.println(t.getName());
		System.out.println(s.getName());
		
		t =  null;
		
		//System.out.println(t.getName());
		System.out.println(s.getName());
		s = null;
		
		
		
	}
}
