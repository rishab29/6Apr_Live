package Lecture7;

public class TwoDArrayDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[][] arr;
        // System.out.println(arr);
         
         arr=new int[3][3];
         System.out.println(arr);
         
         System.out.println(arr[0][0]);
         display(arr);
         
         arr[1][2]=100;
         display(arr);
         
         
         arr=new int[4][];
         System.out.println(arr[0]);
       //  System.out.println(arr[0][1]);
         
         arr[0]=new int[4];
         arr[1]=new int[2];
         arr[2]=new int[3];
         arr[3]=new int[5];
         System.out.println(arr[2]);
         display(arr);
         
       //  arr=new int[][4];
         
	}
	
	public static void display(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
