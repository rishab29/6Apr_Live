package Lecture19;

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
		//list.addLast(60);
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
		
		//list.reversePR();
		//list.display();
		
//		System.out.println(list.mid());
//		System.out.println(list.KthNodeFromEnd(2));
		
	//	list.createCycle();
	//	System.out.println(list.detectCycle());
	//	list.display();
		
//		
//		LinkedList list2=new LinkedList();
//		list2.addLast(15);
//		list2.addLast(25);
//		list2.addLast(35);
		
//		LinkedList ans=list.merge(list2);
//		ans.display();
		
		
//		LinkedList l=new LinkedList();
//		l.addLast(30);
//		l.addLast(20);
//		l.addLast(8);
//		l.addLast(4);
//		l.addLast(2);
//		
//		l.display();
//		
//		l.MergeSort();
//		l.display();
		
		list.reverseDRBtr();
		list.display();
		
		
		
		

	}

}
