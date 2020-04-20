package Lecture7;

public class StringQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="Hello";
      // printAllChars(str);
       printAllSS(str);
	}
	
	public static void printAllChars(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public static void printAllSS(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}

}
