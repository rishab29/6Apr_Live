package Lecture1;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=10;
       int b=10;
       int c=5;
       
       if(a>=b&&a>=c) {
    	   System.out.println("A is largest");
       }else {
    	   if(b>=a&&b>=c) {
    		   System.out.println("B is Largest");
    	   }else {
    		   System.out.println("C is largest");
    	   }
       }
       
     //  
       if(a>=b&&a>=c) {
    	   System.out.println("A is largest");
       }else if(b>=a&&b>=c) {
    	   System.out.println("B is largest");
       }else {
    	   System.out.println("C is largest");
       }
       
       
       
       
       
	}

}
