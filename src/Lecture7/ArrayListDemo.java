package Lecture7;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();

		System.out.println(list);
		list.add(10);

		System.out.println(list);
		System.out.println(list.size());

		list.add(20);

		System.out.println(list);
		System.out.println(list.size());

		list.add(30);

		System.out.println(list);
		System.out.println(list.size());

		list.add(10);

		System.out.println(list);
		System.out.println(list.size());

		list.add(40);

		System.out.println(list);
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		list.remove(2);
		System.out.println(list);
		
		list.set(1, 100);
		System.out.println(list);
		
		
	}

}
