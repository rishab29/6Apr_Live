package Lecture8;

public class RightMostSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(right_most_set_bit(5));
        
        System.out.println(right_most_set_bit(8));
	}
	
	public static int right_most_set_bit(int num) {
		int pos=1;
		int mask=1;
		
		while((mask&num)==0) {
			mask=mask<<1;
			pos++;
		}
		
		return pos;
	}
	
	

}
