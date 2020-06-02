package Lecture28;

public class lcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="abgbjnjsnjnsnsxsjnsxsjnjsns";
        String s2="agbgxsjjcsnsjsjsnsjssjsjs";
        
        System.out.println(lcsI(s1, s2));
        System.out.println(lcs(s1, s2));
       
	}
	
	public static int lcs(String s1,String s2) {
		if(s1.length()==0||s2.length()==0) {
			return 0;
		}
		String ros1=s1.substring(1);
		String ros2=s2.substring(1);
		
		int ans=0;
		if(s1.charAt(0)==s2.charAt(0)) {
			ans=1+lcs(ros1, ros2);
		}else {
			int f1=lcs(s1,ros2);
			int f2=lcs(ros1,s2);
			ans=Math.max(f1,f2);
		}
		
		return ans;
	}
	
	public static int lcsI(String s1,String s2) {
		int[][] strg=new int[s1.length()+1][s2.length()+1];
		
		strg[s1.length()][s2.length()]=0;
		
		for(int i=s1.length();i>=0;i--) {
			for(int j=s2.length();j>=0;j--) {
				//last rows and cols to zero
				if(i==s1.length()||j==s2.length()) {
					strg[i][j]=0;
					continue;
				}
				
				
				if(s1.charAt(i)==s2.charAt(j)) {
					strg[i][j]=1+strg[i+1][j+1];
				}else {
					strg[i][j]=Math.max(strg[i+1][j],strg[i][j+1]);
				}
			}
			
			
		}
		
		return strg[0][0];
	}

}
