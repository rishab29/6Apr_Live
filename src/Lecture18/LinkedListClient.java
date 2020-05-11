package Lecture18;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();

		list.addFirst(10);
		//list.addFirst(5);
		list.display();

		list.addLast(40);
		list.addLast(50);
		//list.display();
		
		list.addAt(1, 20);
		list.addAt(2, 30);
		list.display();
//		
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
//		System.out.println(list.getAt(3));
//		
//		list.removeFirst();
//		list.display();
//		
//		list.removeLast();
//		list.display();
//		
//		list.removeAt(2);
//		list.display();
		
		list.reversePR();
		list.display();
		
		

	}

}
