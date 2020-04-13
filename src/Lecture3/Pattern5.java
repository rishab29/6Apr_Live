package Lecture3;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;

		int row = 1;
		int rows = 2 * n - 1;
		int nsp = 0;
		int nst = n;

		while (row <= 2 * n - 1) {
			int col = 1;
			while (col <= nsp) {
				System.out.print(" ");
				col++;
			}

			col = 1;
			while (col <= nst) {
				System.out.print("*");
				col++;
			}

			if (row < n) {
				nst--;
				nsp = nsp + 2;
			} else {
				nst++;
				nsp = nsp - 2;
			}
			System.out.println();
			row++;
		}
	}

}
