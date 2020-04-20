package Lecture7;

public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		System.out.println(str);

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(3));
		System.out.println(str.length());

		System.out.println(str.substring(2));
		System.out.println(str.substring(1, 4));
		System.out.println(str.substring(2, 2));
		System.out.println(1);
		
		System.out.println(str.startsWith("Hel"));
		System.out.println(str.startsWith("HE"));
		
		String s1="Hello";
		String s2="Hello";
		String s3=s1;
		String s4=new String("Hello");
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s4);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s4));
		
		String s5="Hello";
		System.out.println(s1==s5);
		System.out.println(s4==s5);
		
	    
	

	}

}
