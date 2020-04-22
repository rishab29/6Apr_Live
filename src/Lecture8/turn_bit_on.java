package Lecture8;

public class turn_bit_on {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(turn_bit_on(4, 2));
	}
	
	
	public static int turn_bit_on(int num,int pos) {
		int mask=1;
		mask=mask<<pos-1;
		
		int ans=num|mask;
		
		return ans;
	}

}
