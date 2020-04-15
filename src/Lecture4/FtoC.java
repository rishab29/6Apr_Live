package Lecture4;

public class FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int min=0;
       int max=300;
       int step=20;
       while(min<=max) {
    	   int celsius=(int)((5.0/9)*(min-32));
    	   System.out.println(min+"\t"+celsius);
    	   min=min+step;
       }
	}

}
