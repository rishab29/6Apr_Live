package Lecture17;

public class QUSEnqueueEfficient {

    private DynamicStack pstack;
    private DynamicStack sstack;
    
    public QUSEnqueueEfficient(int capacity) {
		this.pstack=new DynamicStack(capacity);
		this.sstack=new DynamicStack(capacity);
	}
    
    public int size() {
    	return this.pstack.size();
    }
    
    public boolean isEmpty() {
    	return this.size()==0;
    }
    
    public void enqueue(int item) throws Exception {
    	this.pstack.push(item);
    }
    
    public int dequeue() throws Exception{
    	while(this.pstack.size()!=1) {
    		this.sstack.push(this.pstack.pop());
    	}
    	
    	int rv=this.pstack.pop();
    	while(!this.sstack.isEmpty()) {
    		this.pstack.push(this.sstack.pop());
    	}
    	
    	return rv;
    }
    
    
    public int front() throws Exception{
    	while(this.pstack.size()!=1) {
    		this.sstack.push(this.pstack.pop());
    	}
    	
    	int rv=this.pstack.top();
    	while(!this.sstack.isEmpty()) {
    		this.pstack.push(this.sstack.pop());
    	}
    	
    	return rv;
    }
    
    public void display() throws Exception {
    	reverseStack(this.pstack, this.sstack, 0);
    	this.pstack.display();
    	reverseStack(this.pstack, this.sstack, 0);
    }
    
    private static void reverseStack(DynamicStack stack,DynamicStack helper, int idx) throws Exception {
		if(stack.isEmpty()) {
			return;
		}
		
		int item=stack.pop();
		reverseStack(stack, helper, idx+1);
	    helper.push(item);
	    
	    if(idx==0) {
	    	while(!helper.isEmpty()) {
	    		stack.push(helper.pop());
	    	}
	    }
		
	}
    
    

}
