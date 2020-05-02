package Lecture13;

import java.util.Scanner;

public class cbp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		boolean[] primes = new boolean[n + 1];

		for (int i = 2; i < primes.length; i++) {
			if (isPrime(i)) {
				primes[i] = true;
			}
		}
		int[] ladders = makeLadders(primes);
//		for(int i=0;i<ladders.length;i++) {
//			System.out.print(ladders[i]);
//		}
		
		cbp(ladders, n, 0,"");

	}
	
	public static void cbp(int[] ladders,int end,int curr,String res) {
	
		if(end==curr) {
			System.out.println(res+"END");
			return;
		}
		
		if(curr>end) {
			return;
		}
		
		if(ladders[curr]!=0&&curr<ladders[curr]) {
			cbp(ladders, end, ladders[curr], res+ladders[curr]);
		}else{
			for(int dice=1;dice<=6;dice++) {
				cbp(ladders,end,curr+dice,res+dice);
			}
		}
		
		
	}

	public static int[] makeLadders(boolean[] primes) {

		int[] ladders = new int[primes.length + 1];

		int i = 0, j = primes.length - 1;

		while (i < j) {
			while (primes[i] != true) {
				i++;
			}

			while (primes[j] != true) {
				j--;
			}

			ladders[i] = j;
			ladders[j] = i;
			i++;
			j--;
		}
		
		return ladders;

	}

	public static boolean isPrime(int n) {

		int divisor = 2;

		while (divisor < n) {
			if (n % divisor == 0) {
				return false;
			}
			divisor++;
		}

		return true;
	}

}
