package Lecture3;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1;

		int nsp = 0;
		int nst = n;

//		while (row <= n) {             
//			int col = 1;
//			while (col <= nsp) {
//				System.out.print(" ");
//				col++;
//			}
//
//			col = 1;
//			while (col <= nst) {
//				System.out.print("*");
//				col++;
//			}
//
//			nst--;
//			nsp = nsp + 2;
//			System.out.println();
//			row++;
//		}
//		
		
		for(row=1;row<=n;row++) {
			
			for(int col=1;col<=nsp;col++) {
				System.out.print(" ");
			}
			
			
			for(int col=1;col<=nst;col++) {
				System.out.print("*");
			}
			
			nst--;
			nsp = nsp + 2;
			System.out.println();
			
		}
		
	}

}
