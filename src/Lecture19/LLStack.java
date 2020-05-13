package Lecture19;

public class LLStack {

	private LinkedList list;

	public LLStack() {
		// TODO Auto-generated constructor stub
		this.list = new LinkedList();
	}

	public int size() {
		return this.list.size();
	}

	public boolean isEmpty() {
		return this.list.isEmpty();
	}

	public void push(int data) {
		this.list.addFirst(data);
	}

	public int pop() throws Exception {
		return this.list.removeFirst();
	}

	public int top() throws Exception {
		return this.list.getFirst();
	}

	public void display() {
		this.list.display();
	}
}
