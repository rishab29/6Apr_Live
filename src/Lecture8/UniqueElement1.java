package Lecture8;

public class UniqueElement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {3,1,3,5,6,1,6};
        
        int ans=0;
        for(int i=0;i<arr.length;i++) {
        	ans=ans^arr[i];
        	//System.out.println(ans);
        }
        
        System.out.println("Last Ans");
        System.out.println(ans);
	}

}