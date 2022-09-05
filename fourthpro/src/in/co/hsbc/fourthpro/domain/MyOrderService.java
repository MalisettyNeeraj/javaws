package in.co.hsbc.fourthpro.domain;

public class MyOrderService extends OrderService {

	public void cancelOrder() {
		System.out.println("Order Cancelled..");
	}
	
	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		super.placeOrder();
		
	}
}


