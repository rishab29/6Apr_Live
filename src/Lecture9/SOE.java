package Lecture9;

public class SOE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=30;
       soe(n);
	}
	
	public static void soe(int n) {
		boolean[] primes=new boolean[n+1];
		
		for(int i=0;i<primes.length;i++) {
			primes[i]=true;
		}
		
		int n2test=2;
		while(n2test*n2test<=n) {
			if(primes[n2test]) {
				for(int multiplier=2;multiplier*n2test<=n;multiplier++) {
					primes[multiplier*n2test]=false;
				}
			}
			
			n2test++;
		}
		
		for(int i=2;i<primes.length;i++) {
			if(primes[i]) {
				System.out.println(i);
			}
			
		}
	}

}
