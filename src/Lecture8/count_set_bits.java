package Lecture8;

public class count_set_bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(count_set_bits(6));
	} 
	
	public static int count_set_bits(int num) {
		int count=0;
		int mask=1;
		
		while(num!=0) {
			if((num&mask)!=0) {
				count++;
			}
			
			num=num>>1;
		}
		
		return count;
	}

}
