package Lecture25;

import java.util.Arrays;

public class KthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr= {3,2,11,43,12,5,13,50};
		
		System.out.println(sol1(arr, 3));
		System.out.println(sol2(arr, 3));
		System.out.println(sol3(arr, 3));
		

	}
	
	public static int sol1(Integer[] arr,int k) {
		Arrays.sort(arr);
		return arr[arr.length-k];
	}
	
	public static int sol2(Integer[] arr,int k) {
		Heaps<Integer> heap=new Heaps<>(arr, false);
		for(int i=1;i<=k-1;i++) {
			heap.remove();
		}
		
		return heap.getMaxP();
	}
	
	public static int sol3(Integer[] arr,int k) {
		int i=0;
		Integer[] arr2=new Integer[k];
		for(i=0;i<k;i++) {
			arr2[i]=arr[i];
		}
		
		Heaps<Integer> heap=new Heaps<>(arr2, true);
		for(;i<arr.length;i++) {
			if(arr[i]>heap.getMaxP()) {
				heap.remove();
				heap.add(arr[i]);
			}
		}
		
		return heap.getMaxP();
		
	}

}
