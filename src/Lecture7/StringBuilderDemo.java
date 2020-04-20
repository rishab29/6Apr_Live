package Lecture7;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       StringBuilder sb=new StringBuilder("Hello");
       
       
       System.out.println(sb);
       sb.append('y');
       System.out.println(sb);
       
       sb.setCharAt(2, 'i');
       System.out.println(sb);
       
       System.out.println(sb.length());
       
       System.out.println(sb.charAt(3));
       sb.reverse();
       System.out.println(sb);
       
       
	}

}
