package in.co.hsbc.firstpro.d2;

public class MDArray {

	public static void main(String[] args) {

		int nos[][] = new int[2][3];

		nos[0][0] = 100;
		nos[0][1] = 200;
		nos[0][2] = 300;
		
		nos[1][0] = 400;
		nos[1][1] = 500;
		nos[1][2] = 600;
		
		for(int i=0;i<nos.length;i++) {
			for(int j =0;j < nos[i].length;j++) {
			System.out.print(nos[i][j] + "\t");
		}
			System.out.println();

	}
}
}
