package in.co.hsbc.secondpro;

public class ToyTest {

	public static void main(String[] args) {
		Toy t = new Toy();
		t.setCode("123");
		t.setName("Car");
		
		System.out.println(Thread.currentThread().getName());
		t.setAgegroup("8Y");
		System.out.println(t.getCode());
		System.out.println(t.getName());
		System.out.println(t.getAgegroup());
      t = null;
      
      System.gc();

	}
}
