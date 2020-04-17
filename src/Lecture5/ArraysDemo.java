package Lecture5;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr;
      //  System.out.println(arr);
        
        arr=new int[5];
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr.length);
        
       // System.out.println(arr[5]);
        
        System.out.println(arr);
        demo(arr);
       // System.out.println(arr[0]);
       // System.out.println(arr[1]);
        System.out.println();
        display(arr);
        
        
        
        
	}
	
	public static void demo(int[] myarr) {
		//myarr=new int[5];
		myarr[0]=10;
		myarr[1]=20;
		System.out.println(myarr);
		display(myarr);
	}
	
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
