package Lecture28;

public class ed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abgbdjnjnkmksmckdsmcejkekned", s2 = "agbgjnjsnkdmkemdkee";
		
		System.out.println(edI(s1, s2));
		System.out.println(ed(s1, s2));
		
		
	}

	public static int ed(String s1, String s2) {
		if (s1.length() == 0) {
			return s2.length();
		}

		if (s2.length() == 0) {
			return s1.length();
		}

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;
		if (s1.charAt(0) == s2.charAt(0)) {
			ans = ed(ros1, ros2);
		} else {
			int f1 = ed(ros1, ros2);
			int f2 = ed(s1, ros2);
			int f3 = ed(ros1, s2);
			ans = Math.min(f1, Math.min(f2, f3))+1;
		}

		return ans;
	}
	
	public static int edI(String s1,String s2) {
		int[][] strg=new int[s1.length()+1][s2.length()+1];
		
		strg[s1.length()][s2.length()]=0;
		
		for(int i=s1.length();i>=0;i--) {
			for(int j=s2.length();j>=0;j--) {
				if(i==s1.length()) {
					strg[i][j]=s2.length()-j;
					continue;
				}
				
				if(j==s2.length()) {
					strg[i][j]=s1.length()-i;
					continue;
				}
				
				
				if(s1.charAt(i)==s2.charAt(j)) {
					strg[i][j]=strg[i+1][j+1];
				}else {
					int f1=strg[i+1][j+1];
					int f2=strg[i+1][j];
					int f3=strg[i][j+1];
					strg[i][j]=Math.min(f1, Math.min(f2, f3))+1;
				}
			}
		}
		
		return strg[0][0];
	}

}
