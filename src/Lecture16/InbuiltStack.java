package Lecture16;

import java.util.Stack;

public class InbuiltStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack=new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println(stack.peek());
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		

	}

}
