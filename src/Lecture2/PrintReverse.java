package Lecture2;

import java.util.Scanner;

public class PrintReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int rev = 0;
		while (n != 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}

		System.out.println(rev);

	}

}
