package Lecture3;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;

		//int row = 1;
		int nst = 1;

		int value = 1;
//		while (row <= n) {
//			int col = 1;
//			while (col <= nst) {
//				System.out.print(value + "\t");
//				col++;
//				value++;
//				
//			}
//		
//			nst++;
//			System.out.println();
//			row++;
//		}
		
		
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=nst;col++) {
				System.out.print(value+"\t");
				value++;
			}
			nst++;
			System.out.println();
		}
		
	}

}
