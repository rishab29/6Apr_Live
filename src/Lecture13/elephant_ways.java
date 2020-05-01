package Lecture13;

public class elephant_ways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(elephant_ways(1, 1, 0, 0));
	}
	
	public static int elephant_ways(int er,int ec,int cr,int cc) {
		if(er==cr&&ec==cc) {
			return 1;
		}
		
		if(cr>er||cc>ec) {
			return 0;
		}
		
		int count=0;
		for(int i=cc;i<ec;i++) {
			count =count+elephant_ways(er, ec, cr, i+1);
			
		}
		
		for(int i=cr;i<er;i++) {
			count =count+elephant_ways(er, ec, i+1, cc);
			
		}
		
		return count;
	}

}
