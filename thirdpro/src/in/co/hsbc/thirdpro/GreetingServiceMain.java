package in.co.hsbc.thirdpro;

public class GreetingServiceMain {
	
	public static void main(String[] args) {
		
		
		GreetingService gs1 = GreetingService.getInstance();
		System.out.println(gs1.greet());
		System.out.println(gs1);
		
		GreetingService gs2 =  GreetingService.getInstance();
		System.out.println(gs2.greet());
		
		System.out.println(gs2);
	}

}
