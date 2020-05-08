package Lecture17;

import java.util.Stack;

public class NextGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {3,8,1,5,2,6,4};
		nextGreater(arr);

	}
	
	public static void nextGreater(int[] arr) {
		Stack<Integer> stack=new Stack<>();
		
		stack.push(arr[0]);
		for(int i=1;i<arr.length;i++) {
			while(!stack.isEmpty()&&arr[i]>stack.peek()) {
				int rv=stack.pop();
				System.out.println(rv+" => "+arr[i]);
			}
			stack.push(arr[i]);
		}
		
		while(!stack.isEmpty()) {
			int rv=stack.pop();
			System.out.println(rv+" => -1");
		}
		
		
	}

}
