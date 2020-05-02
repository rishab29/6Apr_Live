package Lecture14;

public class FirstAndLastOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,20,30,30,30,30,30,30,40,50,60,70};
		
		System.out.println(FirstOccurence(arr, 30));
		System.out.println(LastOccurence(arr, 30));

	}
	
	public static int FirstOccurence(int[] arr,int key) {
		int ans=-1;
		int si=0,ei=arr.length-1;
		
		while(si<=ei) {
			int mid=(si+ei)/2;
			if(arr[mid]==key) {
				ans=mid;
				ei=mid-1;
			}else if(arr[mid]<key) {
				si=mid+1;
			}else {
				ei=mid-1;
			}
		}
		
		return ans;
		
	}
	
	
	public static int LastOccurence(int[] arr,int key) {
		int ans=-1;
		int si=0,ei=arr.length-1;
		
		while(si<=ei) {
			int mid=(si+ei)/2;
			if(arr[mid]==key) {
				ans=mid;
				si=mid+1;
			}else if(arr[mid]<key) {
				si=mid+1;
			}else {
				ei=mid-1;
			}
		}
		
		return ans;
		
	}

}
