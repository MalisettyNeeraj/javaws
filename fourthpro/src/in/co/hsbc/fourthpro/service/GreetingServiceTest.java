package in.co.hsbc.fourthpro.service;

public class GreetingServiceTest {

	public static void main(String[] args) {

		// GreetingService gs = new GreetingService();
		// System.out.println(gs.greet());

		// GreetingServiceFr gsfr = new GreetingServiceFr();
		// System.out.println(gsfr.greet());

		GreetingService gs;
		gs = new GreetingServiceDe();

		System.out.println(gs.greet());

	}
}
