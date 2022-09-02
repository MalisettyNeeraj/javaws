package in.co.hsbc.thirdpro;

public class CalcServiceTest {
	
	public static void main(String[] args) {
		
		CalcService cs = new CalcService();
		
		//chaining
		int res = cs.setA(10).setB(20).sum();
		
		System.out.println(res);
	}

}
