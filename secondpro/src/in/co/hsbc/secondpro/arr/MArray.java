package in.co.hsbc.secondpro.arr;

public class MArray {
	public static void main(String[] args) {
	//int nos[] = new int[10];
		int nos[][] = new int [2][3];
		//row1
		nos[0][0] = 100;
		nos[0][1] = 200;
		nos[0][2] = 300;
		//row2
		nos[1][0] = 10;
		nos[1][1] = 20;
		nos[1][2] = 30;
		for (int i=0;i<nos.length;i++) {
			
			for (int j = 0;j<nos[i].length;j++) {
				System.out.print(nos[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
	}
}
