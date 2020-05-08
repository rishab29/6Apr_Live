package Lecture17;

public class ReverseQuestions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        DynamicStack stack=new DynamicStack(5);
        
        for(int i=1;i<=5;i++) {
        	stack.push(i*10);       	
        }
        
        stack.display();
        DynamicStack helper=new DynamicStack(5);
        reverseStack(stack,helper,0);
        stack.display();
        
        
        DynamicQueue q=new DynamicQueue(5);
        for(int i=1;i<=5;i++) {
        	q.enqueue(i*10);
        }
        
        q.display();
        reverseQueue(q);
        q.display();
        
	}
	
	
	public static void reverseStack(DynamicStack stack,DynamicStack helper, int idx) throws Exception {
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
	
	public static void reverseQueue(DynamicQueue q) throws Exception{
		if(q.isEmpty()) {
			return;
		}
		
		int item=q.dequeue();
		reverseQueue(q);
		q.enqueue(item);
	}
	
	

}
