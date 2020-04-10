package Lecture2;

public class NthFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;

		int fn = 0;
		int sn = 1;
		int counter = 1;

		while (counter <= n) {
			int next = fn + sn;
			fn = sn;
			sn = next;
			counter++;
		}

		System.out.println(fn);
	}

}
