package Lecture27;

public class DPDemos {
	public static long start;
	public static long end;

	public static void startAlgo() {
		start = System.currentTimeMillis();
	}

	public static long endAlgo() {
		end = System.currentTimeMillis();
		return end - start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 30;
		// int[] strg = new int[n + 1];
//		startAlgo();
//		System.out.println(fib(n));
//		System.out.println("The fib normal took time in ms " + endAlgo());
//
//		startAlgo();
//		System.out.println(fibRS(n, strg));
//		System.out.println("The fibRS took time in ms " + endAlgo());
//
//		startAlgo();
//		System.out.println(fibIS(n));
//		System.out.println("The fibIS took time in ms " + endAlgo());

//		startAlgo();
//		System.out.println(cbp(n,0));
//		System.out.println("The cbp normal took time in ms " + endAlgo());
//		
//		startAlgo();
//		System.out.println(cbpRS(n,0, strg));
//		System.out.println("The cbpRS took time in ms " + endAlgo());
//		
//		startAlgo();
//		System.out.println(cbpIS(n,0));
//		System.out.println("The cbpIS took time in ms " + endAlgo());

//		n=20;
//		int[][] strg = new int[n+1][n+1];
//		System.out.println(cmp(n, n, 0, 0));
//		System.out.println(cmpRS(n, n, 0, 0, strg));
//		
//		System.out.println(cmpIS(n, n, 0, 0));

		n=10000;
		int[] strg2=new int[n+1];
		//System.out.println(minsteps(n));
		System.out.println(minstepsRS(n, strg2));
		System.out.println(minStepsIS(n));

	}

	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int fnm1 = fib(n - 1);
		int fnm2 = fib(n - 2);
		int fn = fnm1 + fnm2;
		return fn;

	}

	public static int fibRS(int n, int[] strg) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (strg[n] != 0) {
			return strg[n];
		}
		int fnm1 = fibRS(n - 1, strg);
		int fnm2 = fibRS(n - 2, strg);
		int fn = fnm1 + fnm2;
		strg[n] = fn;
		return fn;

	}

	public static int fibIS(int n) {
		int[] strg = new int[n + 1];
		strg[0] = 0;
		strg[1] = 1;

		for (int i = 2; i <= n; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}

		return strg[n];
	}

	public static int cbp(int end, int curr) {
		if (curr == end) {
			return 1;
		}

		if (curr > end) {
			return 0;
		}

		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count = count + cbp(end, curr + dice);
		}

		return count;
	}

	public static int cbpRS(int end, int curr, int[] strg) {
		if (curr == end) {
			return 1;
		}

		if (curr > end) {
			return 0;
		}

		if (strg[curr] != 0) {
			return strg[curr];
		}

		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count = count + cbpRS(end, curr + dice, strg);
		}

		strg[curr] = count;
		return count;
	}

	public static int cbpIS(int end, int curr) {
		int[] strg = new int[end + 1];
		strg[end] = 1;

		for (int i = end - 1; i >= 0; i--) {
			int sum = 0;
			for (int dice = 1; dice <= 6 && dice + i < strg.length; dice++) {
				sum = sum + strg[dice + i];
			}

			strg[i] = sum;
		}

		return strg[curr];

	}

	public static int cmp(int er, int ec, int cr, int cc) {
		if (cr == er && cc == ec) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}
		int count = 0;
		count = count + cmp(er, ec, cr, cc + 1);
		count = count + cmp(er, ec, cr + 1, cc);
		return count;
	}

	public static int cmpRS(int er, int ec, int cr, int cc, int[][] strg) {
		if (cr == er && cc == ec) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		if (strg[cr][cc] != 0) {
			return strg[cr][cc];
		}
		int count = 0;
		count = count + cmp(er, ec, cr, cc + 1);
		count = count + cmp(er, ec, cr + 1, cc);

		strg[cr][cc] = count;
		return count;
	}

	public static int cmpIS(int er, int ec, int cr, int cc) {
		int[][] strg = new int[er + 1][ec + 1];
		strg[er][ec] = 1;

		for (int i = er; i >= 0; i--) {
			for (int j = ec; j >= 0; j--) {
				if (i == er || j == ec) {
					strg[i][j] = 1;
				} else {
					strg[i][j] = strg[i + 1][j] + strg[i][j + 1];
				}
			}
		}

		return strg[cr][cc];
	}

	public static int minsteps(int num) {
		if (num == 1) {
			return 0;
		}

		int ans = Integer.MAX_VALUE;

		if (num % 3 == 0) {
			int f1 = 1 + minsteps(num / 3);
			ans = Math.min(ans, f1);
		}

		if (num % 2 == 0) {
			int f2 = 1 + minsteps(num / 2);
			ans = Math.min(ans, f2);

		}

		int f3 = 1 + minsteps(num - 1);
		ans = Math.min(ans, f3);
		return ans;

	}

	public static int minstepsRS(int num, int[] strg) {
		if (num == 1) {
			return 0;
		}

		int ans = Integer.MAX_VALUE;

		if (strg[num] != 0) {
			return strg[num];
		}

		if (num % 3 == 0) {
			int f1 = 1 + minstepsRS(num / 3,strg);
			ans = Math.min(ans, f1);
		}

		if (num % 2 == 0) {
			int f2 = 1 + minstepsRS(num / 2,strg);
			ans = Math.min(ans, f2);

		}

		int f3 = 1 + minstepsRS(num - 1,strg);
		ans = Math.min(ans, f3);
		strg[num] = ans;
		return ans;

	}

	public static int minStepsIS(int num) {
		int[] strg = new int[num + 1];

		strg[1] = 0;

		for (int i = 2; i <= num; i++) {
			int f1 = Integer.MAX_VALUE;
			int f2 = Integer.MAX_VALUE;
			int f3 = Integer.MAX_VALUE;

			if (i % 3 == 0) {
				f1 = strg[i / 3];
			}

			if (i % 2 == 0) {
				f2 = strg[i / 2];
			}

			f3 = strg[i - 1];
			strg[i] = Math.min(f1, Math.min(f2, f3)) + 1;

		}

		return strg[num];
	}

}
