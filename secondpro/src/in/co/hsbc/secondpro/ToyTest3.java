package in.co.hsbc.secondpro;

public class ToyTest3 {

	
	public static void main(String[] args) {
		Toy t1 =  new Toy();
		t1.setCode("123");
		t1.setName("Car");
		t1.setAgegroup("8Y");
		//t1.mfd="ABC";
		
		Toy.mfd = "ABC";
		
		Toy t2 =  new Toy();
		t2.setCode("456");
		t2.setName("Teddy");
		t2.setAgegroup("1Y");
		
		System.out.println(t1.getCode() + " : " + t1.getName() + " : " +  t1.mfd);
		
		
		System.out.println(t2.getCode() + " : " + t2.getName() +  " : " + t2.mfd);
		
		
		
	}
}
