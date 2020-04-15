package Lecture4;


public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 10;
		short sh = 10;
		int in = 10;
		long ln = 10;

		// Part1

		// b=sh;
		// b=in;
		// b=ln;

//        sh=b;
//        sh=in;
//        sh=ln;

//		in=b;
//		in=sh;
//		in=ln;

//		ln=b;
//		ln=sh;
//		ln=in;

		// Part 2

		b = 10; /// implicit conversion
		b = (byte) (128); // explicit type cast
		System.out.println(b);

		b = -128;
		System.out.println(b);

		b = 17;
		System.out.println(b); // 00010001

		b = (byte) (256);
		System.out.println(b);
		// 00000000

		// Part 3
		float f = 3;
		System.out.println(f);

		// float f=5.5;
		f = 5.5f;

		double db = 5.5;
		System.out.println(db);

		// Part 4
		in = (int) (5.5);
		System.out.println(in);

		// Part 5

		long l = 1000000000;

		in = (int) (10000000000l);
        System.out.println(in);
		// Part 6

		boolean bl = false;
		bl = true;

		// bl=0;
		if (bl) {
			System.out.println("Hello");
		} else {
			System.out.println("bye");
		}
		
		
		//Part 7
		
		char ch='a';
		System.out.println(ch);
		
		ch=99;
		System.out.println(ch);
		
//		ch=(char)(69000); // 32 bits
//		                   // 16 bits removed
//		
//		System.out.println(ch);
		
		ch=(char)(ch+2);
		System.out.println(ch);
		
		//ch=ch+(char)(2);
		
		in=ch+2;
		System.out.println(in);
		

	}

}
