package in.co.hsbc.firstpro.model;

public class ProductTest {
	
	public static void main(String[] args) {
		
		Product p = new Product("123");
		
		p.setName("Marker");
		p.setPrice(100);
		
		System.out.println(p.getCode() + " : " + p.getName() + " : " + p.getPrice());
	
	}

}
