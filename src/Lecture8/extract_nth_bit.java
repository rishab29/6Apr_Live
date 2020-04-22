package Lecture8;

public class extract_nth_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(extract_bit(5, 2));
        
        System.out.println(extract_bit(3, 2));
	}

	public static int extract_bit(int num, int pos) {
		int mask = 1;

		mask = mask << pos - 1;

		if ((num & mask) == 0) {
			return 0;
		} else {
			return 1;
		}

	}

}
