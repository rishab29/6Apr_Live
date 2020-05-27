package Lecture25;

public class HeapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Heaps<Integer> heap=new Heaps<>(false);
//		
//		heap.add(35);
//		heap.add(30);
//		heap.add(25);
//		heap.add(20);
//		heap.add(15);
//		heap.add(10);
//		heap.add(5);
//		heap.add(8);
//		heap.add(12);
//		
//		heap.add(45);
//		heap.display();
//		
//		System.out.println("****************************");
//		heap.remove();
//		heap.display();
		
		
		Integer[] arr={5,8,1,7,6,9,4,3};
		Heaps<Integer> heap=new Heaps(arr, false);
		heap.display();
		

	}

}
