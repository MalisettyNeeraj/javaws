package in.co.hsbc.fourthpro.service;

public class OrderService  implements IOrderService{
	private EmailService es;
	
	public void placeOrder() {
		System.out.println("order placed...");
		es = new EmailService();
		es.send();
	}

}
