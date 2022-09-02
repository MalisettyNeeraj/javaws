package in.co.hsbc.thirdpro;

public class GreetingService {
	
	private static GreetingService gs = new GreetingService();
	
	public static GreetingService getInstance() {
			return gs;
	}
	private GreetingService() {
		// TODO Auto-generated constructor stub
	}
	
	public String greet() {
		return "Hello HSBC!!";
		
	}

}
