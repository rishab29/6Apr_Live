package Lecture25;

import java.util.Arrays;
import java.util.Scanner;

public class Circles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Circle[] arr=new Circle[n];
		for(int i=0;i<n;i++) {
			long x=s.nextLong();
			long r=s.nextLong();
			arr[i]=new Circle(x+r, x-r);
		}
		
		Arrays.sort(arr);
		int ans=1,chosen=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i].left_point>=arr[chosen].right_point) {
				ans++;
				chosen=i;
			}
		}
		
		System.out.println(n-ans);

	}
	
	public static class Circle implements Comparable<Circle>{
		long left_point;
		long right_point;
		Circle(long x,long y){
			this.right_point=x;
			this.left_point=y;
		}
		
		public int compareTo(Circle o) {
			if(this.right_point>o.right_point) {
				return 1;
			}else {
				return 0;
			}
		}
	}

}
