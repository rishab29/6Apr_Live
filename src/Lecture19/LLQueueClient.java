package Lecture19;

public class LLQueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LLQueue q = new LLQueue();

		for (int i = 1; i <= 5; i++) {
			q.enqueue(i * 10);
		}

		q.display();
		q.dequeue();
		q.display();

	}

}
