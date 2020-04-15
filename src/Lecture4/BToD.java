package Lecture4;

public class BToD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int dec=32;
       int bin=0;
       
       int tenpowers=1;
       
       while(dec!=0) {
    	   int rem=dec%2;
    	   bin=bin+rem*tenpowers;
    	   tenpowers=tenpowers*10;
    	   dec=dec/2;
       }
       
       System.out.println(bin);
	}

}
