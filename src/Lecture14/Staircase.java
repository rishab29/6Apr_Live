package Lecture14;

public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= {{11,12,13,14},
				      {21,22,23,24},
				      {31,32,33,34},{
				       41,42,43,44}};
		
		System.out.println(find(arr, 25));

	}
	
	public static boolean find(int[][] arr,int key) {
		int i=0,j=arr[0].length-1;
		
		while(j>=0&&i<arr.length) {
			if(arr[i][j]==key) {
				return true;
			}else if(arr[i][j]<key) {
				i++;
			}else {
				j--;
			}
			
		}
		
		return false;
	}

}
