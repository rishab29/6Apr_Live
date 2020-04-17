package Lecture5;

public class MaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {50,30,20,100,10,60};
        
        System.out.println(max(arr));
	}
	
	public static int max(int[]arr) {
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		return max;
	}
	
	

}
