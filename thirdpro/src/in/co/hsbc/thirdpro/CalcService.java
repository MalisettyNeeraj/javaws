package in.co.hsbc.thirdpro;

public class CalcService {
	
	private int a;
	private int b;
	public int getA() {
		return a;
	}
	public CalcService setA(int a) {
		this.a = a;
		return this;
	}
	public int getB() {
		return b;
	}
	public CalcService setB(int b) {
		this.b = b;
		return this;
	}
	
	public int sum()
	{
		return a+b;
	}
	

}
