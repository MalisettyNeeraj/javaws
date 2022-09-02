package in.co.hsbc.firstpro.d2;

public class Message {
	
	private String msg="Hello World!!";
	
	public Message() {
		System.out.println("Hello World!!");
	}
	
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("Bye!!");
	}

}
