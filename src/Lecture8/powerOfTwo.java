package Lecture8;

public class powerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println(powerOfTwo(8));
		System.out.println(powerOfTwo(132));
	}
	
	public static boolean powerOfTwo(int num) {
		
		if(num!=0&&num!=1) {
			if((num&(num-1))==0) {
				return true;
			}
		}
		
		return false;
	}

}
