package Lecture3;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;

		int row = 1;
		int incvalues = 1;
		int decvalues = 0;
		int nsp = n - 1;

		while (row <= n) {
			int col = 1;
			while (col <= nsp) {
				System.out.print("\t");
				col++;
			}

			col = 1;
			int value = row;
			while (col <= incvalues) {
				System.out.print(value + "\t");
				value++;
				col++;
			}

			value = value - 2;
			col = 1;
			while (col <= decvalues) {
				System.out.print(value + "\t");
				value--;
				col++;
			}

			row++;
			System.out.println();
			nsp--;
			incvalues++;
			decvalues++;

		}
	}

}
