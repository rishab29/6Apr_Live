package Lecture19;

public class LLStackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LLStack stack = new LLStack();

		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);
		}
		
		stack.display();
		stack.pop();
		stack.display();
	}

}
