package in.co.hsbc.firstpro;

public class Datatypes {
	
	
	public static void main(String[] args) {
		
		
		int a=100;
		byte b=65;
		boolean bl = true;
		float f = 100.23f;
		double d = 300.2333;
		long x = 1000032033;
		char c = 'S';
		int score[] = {90,80,70,65};
		int nums[] = new int[5];
		
		nums[0] = 100;
		nums[1] = 200;
		
		
		System.out.println(a);
		System.out.println((char)b);
		System.out.println(bl);
		System.out.println(f);
		System.out.println(d);
		System.out.println(x);
		System.out.println(c);
		System.out.println(score[0]);
		
		
	for (int i=0;i<score.length;i++)
	{
		System.out.println(score[i]);
	}
	System.out.println("___________________");
	for (int i : score) {
		System.out.println(i);
	}
	
		
	}

}
