package Lecture31;

import java.util.ArrayList;

import Lecture25.Heaps;



public class MergeKsortedLists {

	public static class Pair implements Comparable<Pair> {
        int data;
        int listno;
        int indexno;
		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return this.data - o.data;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		lists.add(list1);
		
		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(5);
		list2.add(15);
		list2.add(25);
		lists.add(list2);
		
		ArrayList<Integer> list3=new ArrayList<>();
		list3.add(3);
		list3.add(8);
		list3.add(13);
		lists.add(list3);
		
		System.out.println(mergeKsortedLists(lists));

	}

	public static ArrayList<Integer> mergeKsortedLists(ArrayList<ArrayList<Integer>> lists) {

		ArrayList<Integer> ans = new ArrayList<>();
		Heaps<Pair> heap=new Heaps<>(true);
		
		for(int i=0;i<lists.size();i++) {
			Pair pta=new Pair();
			pta.data=lists.get(i).get(0);
			pta.indexno=0;
			pta.listno=i;
			heap.add(pta);
		}
		
		while(!heap.isEmpty()) {
			Pair rp=heap.remove();
			ans.add(rp.data);
			rp.indexno++;
			if(rp.indexno<lists.get(rp.listno).size()) {
				rp.data=lists.get(rp.listno).get(rp.indexno);
				heap.add(rp);
			}
		}
		
		return ans;
	}

}
