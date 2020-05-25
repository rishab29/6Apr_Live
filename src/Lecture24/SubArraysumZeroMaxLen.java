package Lecture24;

import java.util.HashMap;

public class SubArraysumZeroMaxLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,-1,1,2,5,-5,-2};
		System.out.println(maxlen(arr));

	}
	
	public static int maxlen(int[] arr) {
		HashMap<Integer, Integer> map=new HashMap<>();
		int presum=0;
		int max_len=0;
		
		for(int i=0;i<arr.length;i++) {
			presum=presum+arr[i];
			if(arr[i]==0&&max_len==0) {
				max_len=Math.max(max_len, 1);
			}
			
			if(presum==0) {
				max_len=Math.max(max_len, i+1);
			}
			
			if(map.containsKey(presum)) {
				max_len=Math.max(max_len, i-map.get(presum));
			}else {
				map.put(presum,i);
			}
		}
		
		return max_len;
	}

}
