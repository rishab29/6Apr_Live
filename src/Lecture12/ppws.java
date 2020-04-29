package Lecture12;

public class ppws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="abc";
        char[] arr=str.toCharArray();
        ppws(arr,0,arr.length-1);
	}
	
	public static void ppws(char[] arr,int front,int back) {
		if(front==back) {
			display(arr);
		}
		
		for(int i=front;i<arr.length;i++) {
			swap(arr,front,i);
			ppws(arr,front+1,back);
			swap(arr,front,i);
		}
	}
	
	public static void swap(char[] arr,int i,int j) {
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void display(char[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

}
