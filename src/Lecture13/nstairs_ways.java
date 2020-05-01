package Lecture13;

public class nstairs_ways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(n_stairs(4));
	}

	public static int n_stairs(int n) {
		if (n == 0) {
			return 1;
		}

		if (n < 0) {
			return 0;
		}

		int ans = n_stairs(n - 1) + n_stairs(n - 2) + n_stairs(n - 3);
		return ans;
	}

}
