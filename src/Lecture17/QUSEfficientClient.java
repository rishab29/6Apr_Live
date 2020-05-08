package Lecture17;

public class QUSEfficientClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		QUSEnqueueEfficient q= new QUSEnqueueEfficient(5);
		
		for(int i=1;i<=5;i++) {
			q.enqueue(i*10);
		}

		q.display();
		
		q.dequeue();
		q.display();
		
		System.out.println(q.front());
		
		System.out.println(q.size());
	}

}
