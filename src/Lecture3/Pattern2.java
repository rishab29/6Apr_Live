package Lecture3;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int n=5;
	       int row=1;
	       int nst=1;
	       
	       while(row<=n) {
	    	   int col=1;
	    	   while(col<=nst) {
	    		   System.out.print("*");
	    		   col++;
	    	   }
	    	   nst++;
	    	   System.out.println();
	    	   row++;
	      }
	}

}
