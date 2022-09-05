package in.co.hsbc.fourthpro.service;

class Device {
	public void play() {
		System.out.println("play...");
	}
}
class Mouse extends Device {
	public void move() {
		System.out.println("moving");
	}
}

public class DataTypes {
	public static void main(String[] args) {
		
		Device d = new Mouse();
	
		Mouse m = (Mouse)d;
		m.move();
		
		
		int x  = 100;
		
		double dd = x;
		
		System.out.println(x);
		System.out.println(d);
		
		double bal = 10.222345;
		
		int ibal = (int)bal;
		System.out.println(bal);
		System.out.println(ibal);
		
		
		String a  = "100";
		String b = "200";
		System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
		
		
		int score = 183;
		
		System.out.println(String.valueOf(score));
		
		
		Integer i = new Integer(100);
		System.out.println(i);
		
		Integer j = 100;
		
		
		Character c = new Character('c');
		
		Boolean bb = new Boolean(true);
		
		Double amount = 100.200222;
		double damount = amount;
		
		
		
		
	}

}
