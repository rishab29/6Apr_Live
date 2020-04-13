package Lecture3;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int nst = n;
		while (row <= n) {
			int col = 1;
			while (col <= nst) {
				System.out.print("*\t");
				col++;
			}
			nst--;
			System.out.println();
			row++;
		}
	}

}
