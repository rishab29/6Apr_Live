package Lecture15;

public class StackUsingArrays {

	private int[] data;
	private int tos;

	public StackUsingArrays(int capacity) {
		// TODO Auto-generated constructor stub
		this.data = new int[capacity];
		this.tos = -1;
	}

	public int size() {
		return this.tos + 1;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}
	
	public void push(int item) throws Exception{
		if(this.size()==this.data.length) {
			throw new Exception("Stack is Full");
		}
		
		this.tos++;
		this.data[this.tos]=item;
	}
	
	public int pop() throws Exception{
		if(this.size()==0) {
			throw new Exception("Stack is Empty");
		}
		
		int rv=this.data[this.tos];
		this.data[this.tos]=0;
		this.tos--;
		
		return rv;
		
	}
	
	public int top() throws Exception{
		if(this.size()==0) {
			throw new Exception("Stack is Empty");
		}
		
		int rv=this.data[this.tos];		
		return rv;
		
	}
	
	public void display() {
		for(int i=this.tos;i>=0;i--) {
			System.out.println(this.data[i]+" ");
			System.out.println("-----------------");
		}
		
		System.out.println("END");
		System.out.println("*************************");
	}

}
