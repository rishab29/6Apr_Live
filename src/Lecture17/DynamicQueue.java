package Lecture17;

import Lecture16.QueueUsingArrays;

public class DynamicQueue extends QueueUsingArrays {
   
	public DynamicQueue(int capacity) {
		super(capacity);
	}
	
	public void enqueue(int item) throws Exception{
		if(this.data.length==this.size()) {
			int[] arr=new int[2*this.data.length];
			for(int i=0;i<this.size;i++) {
				int ai=(this.front+i)%this.data.length;
				arr[i]=this.data[ai];
			}
			
			this.data=arr;
			this.front=0;
		}
		
		super.enqueue(item);
	}
}
