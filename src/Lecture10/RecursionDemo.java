package Lecture10;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pd(5);
		// pi(5);
		// pdi(5);
		//pdiskip(5);
		
		//System.out.println(fact(5));
		//System.out.println(power(2, 5));
		//System.out.println(fib(6));
		
		int[] arr= {1,3,15,7,9};
		System.out.println(firstIndex(arr, 0, 5));
		System.out.println(isSorted(arr, 0));
		
		System.out.println(powerbetter(2,5));
		
		System.out.println(moveAllXAtEnd("axbdx"));
	}

	public static void pd(int n) {
		if (n == 0) {
			return;
		}

		System.out.println(n);
		pd(n - 1);
	}

	public static void pi(int n) {
		if (n == 0) {
			return;
		}

		pi(n - 1);
		System.out.println(n);

	}

	public static void pdi(int n) {
		if (n == 0) {
			return;
		}

		System.out.println(n);
		pdi(n - 1);
		System.out.println(n);
	}

	public static void pdiskip(int n) {
		if (n == 0) {
			return;
		}
		if (n % 2 == 1) {
			System.out.println(n);
		}

		pdiskip(n - 1);
		if (n % 2 == 0) {
			System.out.println(n);
		}
	}

	public static int fact(int n) {

		if (n == 0) {
			return 1;
		}
		int fnm1 = fact(n - 1);// fact of n-1 ka answer;
		int fn = n * fnm1;// fact of n ka answer;
		return fn;

	}
	
	public static int power(int x,int n) {

		if (n == 0) {
			return 1;
		}
		int pnm1 = power(x,n - 1);// power of x^n-1 ka answer;
		int pn = x * pnm1;// power of x^n ka answer;
		return pn;

	}
	
	public static int fib(int n) {
		if(n==0||n==1) {
			return n;
		}
		int fnm1=fib(n-1);
		int fnm2=fib(n-2);
		int fn=fnm1+fnm2;
		
		return fn;
	}
	
	public static int firstIndex(int[] arr, int index, int data) {
		if (index == arr.length) {
			return -1;
		}

		if (arr[index] == data) {
			return index;
		} else {
			int restans = firstIndex(arr, index + 1, data);
			return restans;
		}
	}
	
	public static boolean isSorted(int[] arr,int si) {
		if(si==arr.length-1) {
			return true;
		}
		if(arr[si]>arr[si+1]) {
			return false;
		}else {
			boolean restans=isSorted(arr,si+1);
			return restans;
		}
	}
	
	public static int powerbetter(int x,int n) {
		if(n==0) {
			return 1;
		}
			
		int ans=1;
		int pnb2=powerbetter(x, n/2);
		if(n%2==1) {
			ans=x*pnb2*pnb2;
		}else {
			ans=pnb2*pnb2;
		}
		
		return ans;
	}
	
	public static String moveAllXAtEnd(String str) {
		if(str.length()==0) {
			return "";
		}
		
		char cc=str.charAt(0);
		String ans="";
		if(cc=='x') {
			String restans=moveAllXAtEnd(str.substring(1));
			ans=restans+'x';
		}else {
			String restans=moveAllXAtEnd(str.substring(1));
		    ans=cc+restans;
		}
		
		return ans;
	}


}
