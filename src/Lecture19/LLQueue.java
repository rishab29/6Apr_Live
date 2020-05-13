package Lecture19;

public class LLQueue {
	private LinkedList list;

	public LLQueue() {
		// TODO Auto-generated constructor stub
		this.list = new LinkedList();
	}

	public int size() {
		return this.list.size();
	}

	public boolean isEmpty() {
		return this.list.isEmpty();
	}

	public void enqueue(int data) {
		this.list.addLast(data);
	}

	public int dequeue() throws Exception {
		return this.list.removeFirst();
	}

	public int front() throws Exception {
		return this.list.getFirst();
	}

	public void display() {
		this.list.display();
	}

}
