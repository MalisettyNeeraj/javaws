package in.co.hsbc.secondpro;

public class CallByRefValue {

	public static void main(String[] args) {
		int nos[] = { 100, 200, 300 };

		for (int i : nos) {
			System.out.println(i);
		}

		System.out.println("_______________________________");
		change(nos);
		for (int i : nos) {
			System.out.println(i);
		}
		
		Toy t = new Toy();
		t.setCode("123");
		System.out.println(t.getCode());
		
		ch(t);
		System.out.println(t.getCode());
	}

	public static void change(int arr[]) {
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

	}
	
	public static void ch(Toy x) {
		x.setCode("7879");
	}

}
