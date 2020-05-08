package Lecture17;

import Lecture15.StackUsingArrays;

public class DynamicStackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 StackUsingArrays stack=new DynamicStack(5);
	        
	        for(int i=1;i<=5;i++) {
	        	stack.push(i*10);
	        	stack.display();
	        }
	        
	        System.out.println(stack.size());
	        
	        stack.push(60);
	       // System.out.println(stack.top());
	        stack.display();

	}

}
