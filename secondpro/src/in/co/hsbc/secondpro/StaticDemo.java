package in.co.hsbc.secondpro;

public class StaticDemo {
	private static int x=100;
	public static void main(String[] args) {
		System.out.println(x);
		m1();
	}
	
	public static void m1() {
		System.out.println("This is m1()....");
	}
	
	public void m2() {
		System.out.println("This is m2().....");
		m1();
	}
}


